package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
public class ResumeController {
 private ResumeService resumeService;
@Autowired
public ResumeController(ResumeService resumeService) {
	super();
	this.resumeService = resumeService;
}
@GetMapping("/getall")
public DataResult<List<Resume>> getAll(){
	  return this.resumeService.getAll();
}
@GetMapping("/getbyid/{id}")
public DataResult<Resume> getById(@PathVariable int id){
	  return this.resumeService.getById(id);
}
@GetMapping("/getbyjobseekerid/{id}")
public DataResult<Resume> getByJobseekerId(@PathVariable int id){
	  return this.resumeService.getByJobseekerId(id);
}
/*@GetMapping("/getdtobyid/{id}")
public DataResult<ResumeDto> getResumeDto(@PathVariable int id){
	  return this.resumeService.getResumeDto(id);
}*/
@PostMapping("/add")
public Result add(@RequestBody Resume Resume){
	  return this.resumeService.add(Resume);
}
@PostMapping("/update")
public Result update(@RequestBody Resume Resume){
	  return this.resumeService.update(Resume);
}
@PostMapping("/delete/{id}")
public Result delete(@PathVariable int id){
	  return this.resumeService.delete(id);
}
}
