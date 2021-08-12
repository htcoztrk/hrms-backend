package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemStaffService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.SystemStaff;

@RestController
@RequestMapping("/api/systemstaffs")
public class SystemStaffController {

	private SystemStaffService systemStaffService;

	@Autowired
	public SystemStaffController(SystemStaffService systemStaffService) {
		super();
		this.systemStaffService = systemStaffService;
	}
	@GetMapping("/getall")
    public DataResult<List<SystemStaff>> getAll(){
  	  return this.systemStaffService.getAll();
    }
    @GetMapping("/getbyid/{id}")
    public DataResult<SystemStaff> getById(@PathVariable int id){
  	  return this.systemStaffService.getById(id);
    }
    @PostMapping("/add")
    public Result add(@RequestBody SystemStaff systemStaff){
  	  return this.systemStaffService.add(systemStaff);
    }
    @PostMapping("/update")
    public Result update(@RequestBody SystemStaff systemStaff){
  	  return this.systemStaffService.update(systemStaff);
    }
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable int id){
  	  return this.systemStaffService.delete(id);
    }
	
}
