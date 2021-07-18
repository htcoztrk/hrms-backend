package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CityController {
	private CityService cityService;
    @Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
    @GetMapping("/getall")
    public DataResult<List<City>> getAll(){
  	  return this.cityService.getAll();
    }
    @GetMapping("/getbyid/{id}")
    public DataResult<City> getById(@PathVariable int id){
  	  return this.cityService.getById(id);
    }
    @PostMapping("/add")
    public Result add(@RequestBody City city){
  	  return this.cityService.add(city);
    }
    @PostMapping("/update")
    public Result update(@RequestBody City city){
  	  return this.cityService.update(city);
    }
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable int id){
  	  return this.cityService.delete(id);
    }
	
}
