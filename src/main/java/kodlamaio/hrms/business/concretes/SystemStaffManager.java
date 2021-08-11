package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemStaffService;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemStaffDao;
import kodlamaio.hrms.entities.concretes.SystemStaff;

@Service
public class SystemStaffManager implements SystemStaffService{

	private SystemStaffDao systemStaffDao;

	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao) {
		super();
		this.systemStaffDao = systemStaffDao;
	}

	@Override
	public DataResult<List<SystemStaff>> getAll() {
		return new SuccessDataResult<List<SystemStaff>>(this.systemStaffDao.findAll(),"listelendi");
	}

	@Override
	public DataResult<SystemStaff> getById(int id) {
		return new SuccessDataResult<SystemStaff>(this.systemStaffDao.findById(null).get(),"listelendi");
	}

	@Override
	public Result add(SystemStaff systemStaff) {
		this.systemStaffDao.save(systemStaff);
		return new SuccessResult("eklendi.");
	}

	@Override
	public Result update(SystemStaff systemStaff) {
		this.systemStaffDao.save(systemStaff);
		return new SuccessResult("updated.");
	}

	@Override
	public Result delete(int id) {
		this.systemStaffDao.deleteById(id);;
		return new SuccessResult("deleted.");
	}
	
}
