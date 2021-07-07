package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.Business.BusinessRules;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.ErrorResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	@Override
	public Result add(Job job) {
		Result result=BusinessRules.Run(CheckIfNameExist(job.getName()));
		if(result!=null) {
			return result;
		}
		jobDao.save(job);
		return new SuccessResult("job added");
	}
	public Result CheckIfNameExist(String name) {
		List<Job> jobs=jobDao.findAll();
		for(Job job:jobs) {
			if(job.getName().equals(name))
			{
				return new ErrorResult("Name is already exist");
			}
		}
		return new SuccessResult();
	}
	@Override
	public DataResult<List<Job>> getAll() {
		
		return new SuccessDataResult<List<Job>>(jobDao.findAll(),"jobs listed");
	}

}
