package kodlamaio.hrms.core.Verification.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.Verification.abstracts.MernisCheckService;

import kodlamaio.hrms.entities.concretes.JobSeeker;
@Service
public class MernisCheckManager implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		return true;
	}


}
