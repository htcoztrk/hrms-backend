package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
	
	 List<JobAdvertisement> getByEmployer_Id(int employerId);
	 
	 @Query("From JobAdvertisement where is_active=true and employer.id=:employerId")
	 List<JobAdvertisement> getActiveAdvByEmployer(int employerId);
	 
     @Query("From JobAdvertisement where is_active = true")
     List<JobAdvertisement> getByActiveStatuss();
	
     
     
     @Query("Select new kodlamaio.hrms.entities.dtos.JobAdvDto(e.company_name,j.name,a.number_of_position,a.due_date,a.releaseDate)"
     	    +" From Job j Inner Join j.advertisements a"
     		+" Inner Join a.employer e"
     	    +" where a.is_active=true" )
     List<JobAdvDto> getDtoByActiveStatus();
}
