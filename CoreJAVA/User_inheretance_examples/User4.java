package User.inheretance;

import study.hasarelation.MyDate;
import study.inheretance.Employee;

public class User4 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(1);
		emp.setName("Dhanraj");
		emp.setDepartment("Development");
		emp.setSalery((1900000/12));
		emp.setDob(new MyDate(16, 05, 1998));
		System.out.println(emp.getEmpid()+", "+emp.getName()+", "+emp.getDepartment()+", "+emp.getSalery()+", "+emp.getDob());
		
		Employee emp1=new Employee(2, "Komal", "Development", 1000000, new MyDate(10, 02, 2000));
		System.out.println(emp1.getEmpid()+", "+emp1.getName()+", "+emp1.getDepartment()+", "+emp1.getSalery()+", "+emp1.getDob());
		
	}

}
