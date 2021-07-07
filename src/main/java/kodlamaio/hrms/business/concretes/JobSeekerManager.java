package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.Verification.abstracts.MailCheckService;
import kodlamaio.hrms.core.Verification.abstracts.MernisCheckService;
import kodlamaio.hrms.core.Verification.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.Business.BusinessRules;
import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.ErrorResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.core.utilities.Results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.Results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	private MernisCheckService mernisCheckService;
	private VerificationCodeService verificationCodeService;
	private MailCheckService mailCheckService;
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, MernisCheckService mernisCheckService,
			VerificationCodeService verificationCodeService,MailCheckService mailCheckService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mernisCheckService = mernisCheckService;
		this.verificationCodeService = verificationCodeService;
		this.mailCheckService=mailCheckService;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
	  
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(),"job seeker listed");	
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		Result result=BusinessRules.Run(NullControl(jobSeeker),
				IdentityControl(jobSeeker.getNational_identity()));
		if(result!=null) {
			return result;
		}
		else if(!mernisCheckService.checkIfRealPerson(jobSeeker)) {
			return new ErrorResult("hey men! are you kidding me? you are fake.");
		}
		//else if(!verificationCodeService.sendEmail(jobSeeker)) {
		//	return new ErrorResult("verify your email address and then come back.");
		//}
		//else if(!mailCheckService.checkEmail(jobSeeker.getEmail())) {
		//	return new ErrorResult("Email is not valid.");
		//}
		
			jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Job Seeker Added.");
		
		
	}
	public Result NullControl(JobSeeker jobSeeker) {
		if(jobSeeker.getBirth_date()==null
				||jobSeeker.getLast_name()==null
				||jobSeeker.getUserId()==0
				||jobSeeker.getFirst_name()==null
				
				) {
			return new ErrorResult("please fill all the fields.");
		}
		    return new SuccessResult();
		
	}
	public Result IdentityControl(String identity) {
		List<JobSeeker> results=jobSeekerDao.findAll();
		for(JobSeeker result:results) {
			if(result.getNational_identity().equals(identity)) {
				return new ErrorResult("User is already exist!");
			}
		}
		
		return new SuccessResult();
		
	}


}
