package kodlamaio.hrms.core.Verification.abstracts;
import kodlamaio.hrms.entities.concretes.User;

public interface VerificationCodeService {

	boolean sendEmail(User user);
}
