package study.inheretance;

import study.hasarelation.MyDate;

public class Employee extends Person {

	private int empid;
	private String department;
	private int salery;

	public Employee() {
		super();
		empid = 0;
		department = "";
		salery = 0;
		System.out.println("You are in parameterless constructor of Employee");
	}

	public Employee(int empid, String name, String department, int salery, MyDate dob) {
		super(name, dob);
		this.empid = empid;
		this.department = department;
		this.salery = salery;
		System.out.println("You are in parameterized constructor of Employee");
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {

			Employee temp = (Employee) obj;
			if (this.empid == temp.empid && this.salery == temp.salery && this.department.equals(temp.department)
					&& this.getName().equals(temp.getName()) && this.getDob().equals(temp.getDob())) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", department=" + department + ", salery=" + salery + "]";
	}

}
