package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationController {
 private EducationService educationService;

 @Autowired
public EducationController(EducationService educationService) {
	super();
	this.educationService = educationService;
}
 @GetMapping("/getall")
 public DataResult<List<Education>> getAll(){
	  return this.educationService.getAll();
 }
 @GetMapping("/getbyid/{id}")
 public DataResult<Education> getById(@PathVariable int id){
	  return this.educationService.getById(id);
 }
 @PostMapping("/add")
 public Result add(@RequestBody Education education){
	  return this.educationService.add(education);
 }
 @PostMapping("/update")
 public Result update(@RequestBody Education education){
	  return this.educationService.update(education);
 }
 @PostMapping("/delete/{id}")
 public Result delete(@PathVariable int id){
	  return this.educationService.delete(id);
 }
}
