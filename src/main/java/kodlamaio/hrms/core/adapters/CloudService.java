package kodlamaio.hrms.core.adapters;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.Results.DataResult;

public interface CloudService {
	DataResult<Map<String, String>> upload(MultipartFile multipartFile);
    DataResult<Map> delete(String id) throws IOException;
}
