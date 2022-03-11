package study.entity.onetoOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "emp220")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int employeeID;

	private String name, email;

	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private Address adress;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeID, String name, String email, Address adress) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.email = email;
		this.adress = adress;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", email=" + email + ", adress=" + adress
				+ "]";
	}

}
