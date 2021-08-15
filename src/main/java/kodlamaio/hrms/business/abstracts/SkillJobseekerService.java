package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.SkillJobseeker;

public interface SkillJobseekerService {
	DataResult<List<SkillJobseeker>> getAll();
	DataResult<SkillJobseeker> getById(int id);
	Result add(int id,SkillJobseeker skillJobseeker);
	Result update(SkillJobseeker skillJobseeker);
	Result delete(int id);
}
