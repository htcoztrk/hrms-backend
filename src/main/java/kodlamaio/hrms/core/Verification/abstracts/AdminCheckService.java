package kodlamaio.hrms.core.Verification.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface AdminCheckService {
  boolean isValid(Employer employer);
}
