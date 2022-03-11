package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Emp_tbl_Hibernate")
public class EmployeeEntity {
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_salary")
	private int salary;
	
	@Column(name = "emp_uname")
	private String uname;
	
	
	@Column(name = "emp_dept")
	private String department;
	
	@Column(name = "emp_pass")
	private String password;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeEntity(String name, int salary, String department, String uname, String password) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.uname = uname;
		this.password = password;
	}

	public EmployeeEntity(int id, String name, int salary, String department, String uname, String password) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.uname = uname;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", uname=" + uname + ", password=" + password + "]";
	}
	
	
	
}
	

