package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Experience;

public interface ExperienceService {
	DataResult<List<Experience>> getAll();
	DataResult<Experience> getById(int id);
	Result add(Experience experience,int id);
	Result update(Experience experience);
	Result delete(int id);
}
