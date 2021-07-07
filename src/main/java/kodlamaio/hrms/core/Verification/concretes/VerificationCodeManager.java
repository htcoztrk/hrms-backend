package kodlamaio.hrms.core.Verification.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.Verification.abstracts.VerificationCodeService;
import kodlamaio.hrms.entities.concretes.User;
@Service
public class VerificationCodeManager implements VerificationCodeService{

	@Override
	public boolean sendEmail(User user) {
		
		return true;
	}

}
