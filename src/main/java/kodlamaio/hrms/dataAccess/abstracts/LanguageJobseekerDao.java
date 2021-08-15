package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.LanguageJobseeker;

public interface LanguageJobseekerDao extends JpaRepository<LanguageJobseeker,Integer>{

}
