package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SocialMediaAccService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.SocialMediaAccount;

@RestController
@RequestMapping("/api/socialmediaaccounts")
public class SocialMediaAccController {
 
	private SocialMediaAccService socialMediaAccService;
    @Autowired
	public SocialMediaAccController(SocialMediaAccService socialMediaAccService) {
		super();
		this.socialMediaAccService = socialMediaAccService;
	}
    @GetMapping("/getall")
    public DataResult<List<SocialMediaAccount>> getAll(){
  	  return this.socialMediaAccService.getAll();
    }
    @GetMapping("/getbyid/{id}")
    public DataResult<SocialMediaAccount> getById(@PathVariable int id){
  	  return this.socialMediaAccService.getById(id);
    }
    @PostMapping("/add")
    public Result add(@RequestBody SocialMediaAccount socialMediaAccount){
  	  return this.socialMediaAccService.add(socialMediaAccount);
    }
    @PostMapping("/update")
    public Result update(@RequestBody SocialMediaAccount socialMediaAccount){
  	  return this.socialMediaAccService.update(socialMediaAccount);
    }
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable int id){
  	  return this.socialMediaAccService.delete(id);
    }
}
