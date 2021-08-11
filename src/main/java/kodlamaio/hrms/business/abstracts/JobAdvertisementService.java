package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvDto;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<JobAdvertisement> getById(int id);
	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdvertisement);
	Result delete(int id);
	Result makePassive(int id);
	DataResult<List<JobAdvertisement>> getByActiveStatus();
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	DataResult<List<JobAdvertisement>> getByEmployerId(int id);
	DataResult<List<JobAdvertisement>> getActiveAdvByEmployer(int employerId);
	
	DataResult<List<JobAdvDto>> getDtoByActiveStatus();
}
