package kodlamaio.hrms.entities.concretes;

import java.util.List;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="skills")
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private int Id;  
	   
	   @Column(name="name")
	   private String name; 
	   
	   @JsonIgnore
	   @OneToMany(mappedBy="skill")
	   private List<SkillJobseeker> skilljobseekers;
}
