

public class Employee {
			private int EmpId;
			private String name;
			private int salary;
			
			
			
			Employee(int i, String n, int s )
			{
				EmpId=i;
				name=n;
				salary=s;
				
			}
			
			public int getEmpId() {
				return EmpId;
			}



			public void setEmpId(int empId) {
				EmpId = empId;
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



			public String toString()
			{		
				String str = "Employee Id :" + EmpId + ",\nName:" + name + ", \nSalary : " + salary ;
						
				return str;
			}

			
			
}
