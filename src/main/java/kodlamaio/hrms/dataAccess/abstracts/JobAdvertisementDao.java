package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
	
	 List<JobAdvertisement> getByEmployer_Id(int employerId);
	 
     @Query("From JobAdvertisement where is_active = true")
     List<JobAdvertisement> getByActiveStatuss();
	
}
