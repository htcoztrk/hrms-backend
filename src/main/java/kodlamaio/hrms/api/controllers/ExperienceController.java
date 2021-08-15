package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.dataAccess.abstracts.ExperienceDao;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences")
public class ExperienceController {

	private ExperienceService experienceService;

	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	  @GetMapping("/getall")
	    public DataResult<List<Experience>> getAll(){
	  	  return this.experienceService.getAll();
	    }
	    @GetMapping("/getbyid/{id}")
	    public DataResult<Experience> getById(@PathVariable int id){
	  	  return this.experienceService.getById(id);
	    }
	    @PostMapping("/add")
	    public Result add(@RequestBody Experience experience,@RequestParam int id){
	  	  return this.experienceService.add(experience,id);
	    }
	    @PostMapping("/update")
	    public Result update(@RequestBody Experience experience){
	  	  return this.experienceService.update(experience);
	    }
	    @PostMapping("/delete/{id}")
	    public Result delete(@PathVariable int id){
	  	  return this.experienceService.delete(id);
	    }
}
