package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume,Integer>{
	
	Resume getByJobseeker_Id(int id);

	/*@Query("Select new kodlamaio.hrms.entities.dtos.ResumeDto(j.fist_name,l)"
			+" From Resume r Inner Join r.jobseeker j"
			+" Inner Join j.languagejobseekers lj"
			+" Inner Join lj.language l"
			+" GROUP BY j.id"
			+" where j.id=:id")
    ResumeDto getResumeDto(int id);*/
}



