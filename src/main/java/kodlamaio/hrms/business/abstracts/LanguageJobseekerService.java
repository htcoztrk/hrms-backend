package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.LanguageJobseeker;


public interface LanguageJobseekerService {
	DataResult<List<LanguageJobseeker>> getAll();
	DataResult<LanguageJobseeker> getById(int id);
	Result add(int id,LanguageJobseeker languageJobseeker);
	Result update(LanguageJobseeker languageJobseeker);
	Result delete(int id);
}
