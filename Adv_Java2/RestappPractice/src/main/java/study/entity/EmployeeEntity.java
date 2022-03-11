package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Employee_tbl_REST")
public class EmployeeEntity {
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_salary")
	private int salary;
	
	@Column(name = "emp_dept")
	private String department;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(String name, int salary, String department) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	
	public EmployeeEntity(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
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

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	

}
