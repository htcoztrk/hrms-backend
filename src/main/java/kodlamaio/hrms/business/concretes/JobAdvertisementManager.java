package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.City;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
@Service
public class JobAdvertisementManager implements  JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"listed");
	}
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("added");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertisementDao.deleteById(id);;
		return new SuccessResult("deleted");
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		JobAdvertisement j=this.jobAdvertisementDao.findById(id).get();
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.findById(id).get());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveStatus() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActiveStatuss(),"Active job Ads List:");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDate() {
		// TODO Auto-generated method stub
		Sort sort=Sort.by(Sort.Direction.ASC,"release_date");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployerId(int id) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployer_Id(id));
	}

	@Override
	public Result makePassive(int id) {
		JobAdvertisement j=this.jobAdvertisementDao.findById(id).get();
		j.set_active(false);
		this.jobAdvertisementDao.save(j);
		return new SuccessResult("pasif yapıldı");
	}

}
