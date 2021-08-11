package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Image;

public interface ImageService {
	DataResult<List<Image>> getAll();
	DataResult<Image> getById(int id);
	DataResult<Image> getByUserId(int id);
	Result add(MultipartFile multipartFile);
	Result update(MultipartFile multipartFile);
	Result delete(int id);
}
