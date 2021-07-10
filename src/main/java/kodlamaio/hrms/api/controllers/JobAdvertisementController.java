package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementController {
   private JobAdvertisementService jobAdvertisementService;
   @Autowired
   public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
	  super();
	  this.jobAdvertisementService = jobAdvertisementService;
   }
   @GetMapping("/getall")
   public DataResult<List<JobAdvertisement>> getAll(){
	   return this.jobAdvertisementService.getAll();
   }
   @GetMapping("/getbyid")
   public DataResult<JobAdvertisement> getById(@PathVariable int id){
 	  return this.jobAdvertisementService.getById(id);
   }
   @PostMapping("/add")
   public Result add(@RequestBody JobAdvertisement jobAdv){
 	  return this.jobAdvertisementService.add(jobAdv);
   }
   @PostMapping("/update")
   public Result update(@RequestBody JobAdvertisement jobAdv){
 	  return this.jobAdvertisementService.update(jobAdv);
   }
   @PostMapping("/delete/{id}")
   public Result delete(@PathVariable int id){
 	  return this.jobAdvertisementService.delete(id);
   }

  
}
