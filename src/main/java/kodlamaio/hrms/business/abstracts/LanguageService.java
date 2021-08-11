package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Language;

public interface LanguageService {
	DataResult<List<Language>> getAll();
	DataResult<Language> getById(int id);
	Result add(Language language);
	Result update(Language language);
	Result delete(int id);
}
