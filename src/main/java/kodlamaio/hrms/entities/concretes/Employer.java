package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="id")
  private int id;
	
	@Column(name="company_name")
  private String company_name;
	
	@Column(name="website")
  private String website;
	
	@Column(name="phone")
  private String phone;
	
	@Column(name="user_id")
  private int user_Id;
public Employer() {}
public Employer(int id, String company_name, String website, String phone, int user_Id) {
	super();
	this.id = id;
	this.company_name = company_name;
	this.website = website;
	this.phone = phone;
	this.user_Id = user_Id;
}
  
}
