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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="experiences")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobseeker"})
public class Experience {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="workplace")
	private String workplace;
	
	@Column(name="starting_date")
	private Date startingDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@ManyToOne()
	@JoinColumn(name="job_id")
	Job job;
	
	@ManyToOne()
	@JoinColumn(name="jobseeker_id")
	JobSeeker jobseeker;
	 
}
