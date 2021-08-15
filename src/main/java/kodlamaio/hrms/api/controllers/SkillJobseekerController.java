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

import kodlamaio.hrms.business.abstracts.SkillJobseekerService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.SkillJobseeker;

@RestController
@RequestMapping("/api/skilljobseekers")
public class SkillJobseekerController {
 private SkillJobseekerService skillJobseekerService;
 @Autowired
public SkillJobseekerController(SkillJobseekerService skillJobseekerService) {
	super();
	this.skillJobseekerService = skillJobseekerService;
}
 @GetMapping("/getall")
 public DataResult<List<SkillJobseeker>> getAll(){
	  return this.skillJobseekerService.getAll();
 }
 @GetMapping("/getbyid/{id}")
 public DataResult<SkillJobseeker> getById(@PathVariable int id){
	  return this.skillJobseekerService.getById(id);
 }
 @PostMapping("/add")
 public Result add(@RequestParam int id,@RequestBody SkillJobseeker SkillJobseeker){
	  return this.skillJobseekerService.add(id,SkillJobseeker);
 }
 @PostMapping("/update")
 public Result update(@RequestBody SkillJobseeker SkillJobseeker){
	  return this.skillJobseekerService.update(SkillJobseeker);
 }
 @PostMapping("/delete/{id}")
 public Result delete(@PathVariable int id){
	  return this.skillJobseekerService.delete(id);
 }
}
