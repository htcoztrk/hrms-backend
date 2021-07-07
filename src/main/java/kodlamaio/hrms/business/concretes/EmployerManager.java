package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.Verification.abstracts.AdminCheckService;
import kodlamaio.hrms.core.Verification.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.Business.BusinessRules;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.ErrorResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private VerificationCodeService verificationCodeService;
	private AdminCheckService adminCheckService;
	@Autowired
	public EmployerManager(EmployerDao employerDao, VerificationCodeService verificationCodeService,
			AdminCheckService adminCheckService) {
		super();
		this.employerDao = employerDao;
		this.verificationCodeService = verificationCodeService;
		this.adminCheckService=adminCheckService;
	}

	

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Employer Listed");
	}

	@Override
	public Result add(Employer employer) {
		
		Result result=BusinessRules.Run(
				CheckIfNull(employer));
		if(result!=null)
		{
			return result;
		}
		else if(!adminCheckService.isValid(employer))
		{
			return new ErrorResult("Employer is not validated by System Stuff.");
		}
		/*else if(!verificationCodeService.sendEmail(employer))
		{
			return new ErrorResult("Email is not verified yet.");
		}*/
		employerDao.save(employer);
		return new SuccessResult("employer added");
	}
	public Result CheckIfNull(Employer employer) {
		if(employer.getPhone()==null
				||employer.getCompany_name()==null
				||employer.getUser_Id()==0
				||employer.getWebsite()==null
				){
			return new ErrorResult("fill all the field");
		}
		return new SuccessResult();
		
	}
	/*public Result CheckIfEmailExist(String email) {
		List<Employer> employers=employerDao.findAll();
		for(Employer employer:employers) {
			//burayı email ile degistir.
			if(employer.getEmail().equals(email))
			{
				return new ErrorResult("Email is already used");
			}
		}
		return new SuccessResult();
	}*/

	/*public Result CheckIfDomainSame(Employer employer) {
		String[] emailSplit = employer.getEmail().split("@");
		if (!employer.getWebsite().contains(emailSplit[1])) {
			return new ErrorResult("The e-mail address must be an extension of the web address.");
		}
		else {
			return new SuccessResult();
		}
		
	}*/

}
