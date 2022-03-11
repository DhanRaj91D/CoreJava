package study.entity.onetomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EmpOM")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer employeeID;

	@Column(name = "EMAIL",unique=true, nullable = false, length = 100)
	private String email;

	@Column(name = "FIRST NAME", unique = false, nullable = false, length = 100)
	private String firsttName;

	@Column(name = "LAST NAME", unique = false, nullable = false, length = 100)
	private String lastName;

	 // this annotation is to connect both class in one e to many relation and
											// cascade is used if the base class entry deleted then other child class
											// entry for same get deleted
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMPLOPYEE_ID")
	private Set<AccountEntity> accounts;



	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirsttName() {
		return firsttName;
	}

	public void setFirsttName(String firsttName) {
		this.firsttName = firsttName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<AccountEntity> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<AccountEntity> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeID=" + employeeID + ", email=" + email + ", firsttName=" + firsttName
				+ ", lastName=" + lastName + ", accounts=" + accounts + "]";
	}

}
