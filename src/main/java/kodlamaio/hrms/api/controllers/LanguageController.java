package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	   @GetMapping("/getall")
	    public DataResult<List<Language>> getAll(){
	  	  return this.languageService.getAll();
	    }
	    @GetMapping("/getbyid/{id}")
	    public DataResult<Language> getById(@PathVariable int id){
	  	  return this.languageService.getById(id);
	    }
	    @PostMapping("/add")
	    public Result add(@RequestBody Language language){
	  	  return this.languageService.add(language);
	    }
	    @PostMapping("/update")
	    public Result update(@RequestBody Language language){
	  	  return this.languageService.update(language);
	    }
	    @PostMapping("/delete/{id}")
	    public Result delete(@PathVariable int id){
	  	  return this.languageService.delete(id);
	    }
}
