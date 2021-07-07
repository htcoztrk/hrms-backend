package kodlamaio.hrms.core.Verification.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.Verification.abstracts.VerificationCodeService;
import kodlamaio.hrms.entities.concretes.JobSeeker;
@Service
public class VerificationCodeManager implements VerificationCodeService{

	@Override
	public boolean sendEmail(JobSeeker jobSeeker) {
		
		return true;
	}

}
