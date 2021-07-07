package kodlamaio.hrms.core.Verification.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.Verification.abstracts.AdminCheckService;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class AdminCheckManager implements AdminCheckService{

	@Override
	public boolean isValid(Employer employer) {
		// TODO Auto-generated method stub
		return true;
	}

}
