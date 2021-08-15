package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvDto {
	String companyName;
	String jobName;
	int numOfPosition;
	Date dueDate;
	Date releaseDate;
}