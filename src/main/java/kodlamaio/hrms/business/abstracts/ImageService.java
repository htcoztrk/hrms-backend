package kodlamaio.hrms.business.abstracts;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Image;

public interface ImageService {
	DataResult<List<Image>> getAll();
	DataResult<Image> getById(int id);
	DataResult<List<Image>> getByUserId(int id);
	Result add(MultipartFile multipartFile ,int id);
	Result delete(int id) throws IOException;
}
