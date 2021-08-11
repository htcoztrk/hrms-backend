package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll());
	}

	@Override
	public DataResult<Education> getById(int id) {
		return new SuccessDataResult<Education>(this.educationDao.findById(id).get());
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("ekleme yapıldı");
	}

	@Override
	public Result update(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("update yapıldı");
	}

	@Override
	public Result delete(int id) {
		this.educationDao.deleteById(id);
		return new SuccessResult("silme yapıldı");
	}

}
