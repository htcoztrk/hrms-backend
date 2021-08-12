package kodlamaio.hrms.api.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImageController {
  private ImageService imageService;
@Autowired
public ImageController(ImageService imageService) {
	super();
	this.imageService = imageService;
}
@GetMapping("/getall")
public DataResult<List<Image>> getAll(){
	  return this.imageService.getAll();
}
@GetMapping("/getbyid/{id}")
public DataResult<Image> getById(@PathVariable int id){
	  return this.imageService.getById(id);
}
@GetMapping("/getbyuserid/{id}")
public DataResult<List<Image>> getByUserId(@PathVariable int id){
	  return this.imageService.getByUserId(id);
}
@PostMapping("/add")
public Result add(@RequestBody MultipartFile  image,@RequestParam("id")int id){
	  return this.imageService.add(image, id);
}

@DeleteMapping("/delete/{id}")
public Result delete(@PathVariable int id) throws IOException{
	  return this.imageService.delete(id);
}

}
