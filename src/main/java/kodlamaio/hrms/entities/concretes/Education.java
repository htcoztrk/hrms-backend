package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="educations")
public class Education {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
       private int id;
	   
	   @Column(name="school_name")
       private String schoolName;
	   
	   @Column(name="faculty")
       private String faculty;
	   
	   @Column(name="department")
       private String department;
	   
	   @Column(name="starting_date")
       private Date startingDate;
	   
	   @Column(name="graduation_date")
       private Date graduationDate;
       
       @ManyToOne()
       @JoinColumn(name="jobseeker_id")
       JobSeeker jobseeker;
}
