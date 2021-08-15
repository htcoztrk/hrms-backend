package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeService {
	DataResult<List<Resume>> getAll();
	DataResult<Resume> getById(int id);
	DataResult<Resume> getByJobseekerId(int id);
	//DataResult<ResumeDto> getResumeDto(int id);
	Result add(Resume resume);
	Result update(Resume resume);
	Result delete(int id);
}
