package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {

	DataResult<List<CoverLetter>> getAll();
	DataResult<CoverLetter> getById(int id);
	Result add(CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);
	Result delete(int id);
}
