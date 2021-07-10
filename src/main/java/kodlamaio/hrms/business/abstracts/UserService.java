package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	DataResult<User> getById();
	Result add(User user);
	Result update(User user);
	Result delete(int id);
	  
}
