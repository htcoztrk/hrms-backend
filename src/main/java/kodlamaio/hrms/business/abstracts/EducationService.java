package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Education;

public interface EducationService {
	DataResult<List<Education>> getAll();
	DataResult<Education> getById(int id);
	DataResult<List<Education>> getByJobseekerId(int id);
	Result add(Education education,int jobseekerId);
	Result update(Education education);
	Result delete(int id);
}
