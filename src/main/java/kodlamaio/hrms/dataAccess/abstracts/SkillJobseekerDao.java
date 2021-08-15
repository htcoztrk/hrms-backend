package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SkillJobseeker;

public interface SkillJobseekerDao extends JpaRepository<SkillJobseeker,Integer> {

}
