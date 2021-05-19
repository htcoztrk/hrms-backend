package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_seekers")
public class JobSeeker {
   @Id
   @GeneratedValue
   @Column(name="id")
   private int Id;  
   
   @Column(name="user_id")
   private int userId; 
   
   @Column(name="first_name")
   private String first_name;
   
   @Column(name="last_name")
   private String last_name;
   
   @Column(name="national_identity")
   private String national_identity;
   
   @Column(name="birth_date")
   private Date birth_date;
public JobSeeker() {}
public JobSeeker(int id, int userId, String first_name, String last_name, String national_identity, Date birth_date) {
	super();
	this.Id = id;
	this.userId = userId;
	this.first_name = first_name;
	this.last_name = last_name;
	this.national_identity = national_identity;
	this.birth_date = birth_date;
}
}





