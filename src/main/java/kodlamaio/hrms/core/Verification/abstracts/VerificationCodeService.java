package kodlamaio.hrms.core.Verification.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface VerificationCodeService {

	boolean sendEmail(JobSeeker jobSeeker);
}
