package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker  {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
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

}





