package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="verifications")
@AllArgsConstructor
@NoArgsConstructor
public class Verification {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="id")
	  private int id;
	  
	  @Column(name="mernis_verification")
	  private boolean mernisVerification;
	  
	  @Column(name="email_verification")
	  private boolean emailVerification;
	  
	  @Column(name="system_verification")
	  private boolean systemVerification;
	  
	  @OneToOne()
	  @JoinColumn(name="user_id")
	  private User user;
}
