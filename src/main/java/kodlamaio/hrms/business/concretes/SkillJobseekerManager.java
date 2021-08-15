package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SkillJobseekerService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.dataAccess.abstracts.SkillJobseekerDao;
import kodlamaio.hrms.entities.concretes.SkillJobseeker;
@Service
public class SkillJobseekerManager implements SkillJobseekerService{

	private SkillJobseekerDao skillJobseekerDao;
	private JobSeekerDao jobseekerDao;
	@Autowired
	public SkillJobseekerManager(SkillJobseekerDao skillJobseekerDao, JobSeekerDao jobseekerDao) {
		super();
		this.skillJobseekerDao = skillJobseekerDao;
		this.jobseekerDao = jobseekerDao;
	}

	@Override
	public DataResult<List<SkillJobseeker>> getAll() {
		return new SuccessDataResult<List<SkillJobseeker>>(this.skillJobseekerDao.findAll());
	}

	@Override
	public DataResult<SkillJobseeker> getById(int id) {
		return new SuccessDataResult<SkillJobseeker>(this.skillJobseekerDao.findById(id).get());
	}

	@Override
	public Result add(int id, SkillJobseeker skillJobseeker) {
		skillJobseeker.setJobseeker(this.jobseekerDao.findById(id).get());
		return new SuccessResult("eklendi");
	}

	@Override
	public Result update(SkillJobseeker skillJobseeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		this.skillJobseekerDao.deleteById(id);
		return new SuccessResult("deleted");
	}

}
