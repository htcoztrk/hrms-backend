package kodlamaio.hrms.core.Verification.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface MernisCheckService {

	boolean checkIfRealPerson(JobSeeker jobSeeker);
}
