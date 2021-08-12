package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

	private SkillService skillService;

	@Autowired
	public SkillController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	 @GetMapping("/getall")
	    public DataResult<List<Skill>> getAll(){
	  	  return this.skillService.getAll();
	    }
	    @GetMapping("/getbyid/{id}")
	    public DataResult<Skill> getById(@PathVariable int id){
	  	  return this.skillService.getById(id);
	    }
	    @PostMapping("/add")
	    public Result add(@RequestBody Skill skill){
	  	  return this.skillService.add(skill);
	    }
	    @PostMapping("/update")
	    public Result update(@RequestBody Skill skill){
	  	  return this.skillService.update(skill);
	    }
	    @PostMapping("/delete/{id}")
	    public Result delete(@PathVariable int id){
	  	  return this.skillService.delete(id);
	    }
}
