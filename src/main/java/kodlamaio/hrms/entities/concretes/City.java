package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cities")
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Column(name="city_id")
	private int id;
    @Column(name="city_name")
	private String city_name;
	
}
