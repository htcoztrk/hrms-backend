package kodlamaio.hrms.entities.concretes;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","educations","socialMediaAccounts"})
public class JobSeeker  {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
   private int Id;  
   
   @Column(name="first_name")
   private String first_name;
   
   @Column(name="last_name")
   private String last_name;
   
   @Column(name="national_identity")
   private String national_identity;
   
   @Column(name="birth_date")
   private Date birth_date;

   @OneToMany(mappedBy="jobseeker")
   private List<Education> educations;
   
   @OneToMany(mappedBy="jobseeker")
   private List<SocialMediaAccount> socialMediaAccounts;
   
   @OneToMany(mappedBy="jobseeker")
   private List<Experience> experiences;
   
   @OneToMany(mappedBy="jobseeker")
   private List<Skill> skills;
   
   @OneToMany(mappedBy="jobseeker")
   private List<CoverLetter> coverletter;
   
   @OneToOne()
   @JoinColumn(name="user_id")
   private User user;
   
   @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   @JoinTable(name = "jobseeker_language",
           joinColumns = {
                   @JoinColumn(name = "jobseeker_id")
           },
           inverseJoinColumns = {
                   @JoinColumn(name = "language_id")})
   private List<Language> language;
}





