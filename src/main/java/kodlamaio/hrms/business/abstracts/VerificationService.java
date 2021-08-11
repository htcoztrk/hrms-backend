package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Verification;

public interface VerificationService {
	DataResult<List<Verification>> getAll();
	DataResult<Verification> getById(int id);
	Result add(Verification verification);
	Result update(Verification verification);
	Result delete(int id);
}
