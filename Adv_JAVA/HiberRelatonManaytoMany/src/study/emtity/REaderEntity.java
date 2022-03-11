package study.emtity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name="Reader",uniqueConstraints= {
		@UniqueConstraint(columnNames="r_ID"),
		@UniqueConstraint(columnNames="EMAIL")})

public class REaderEntity {
	
	private Integer readerID;
	
	private String email;
	
	private String fName;
	
	private String lName;
	
	
	
	

}
