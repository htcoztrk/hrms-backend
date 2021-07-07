package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	private JobService jobService;
    @Autowired
	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
    @GetMapping("/getall")
    public DataResult<List<Job>> getAll() {
    	return this.jobService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Job job) {
    	return this.jobService.add(job);
    }
}
