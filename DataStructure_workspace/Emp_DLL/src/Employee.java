

public class Employee {
			private int EmpId;
			private String name;
			private int salary;
			private char gender;
			
			
			Employee(int i, String n, int s,char g)
			{
				EmpId=i;
				name=n;
				salary=s;
				gender = g;
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


			public char getGender() {
				return gender;
			}

			public void setGender(char gender) {
				this.gender = gender;
			}

			public String toString()
			{		
				String str =  EmpId + ",\nName:" + name + ", \nSalary : " + salary + "\nGender :" + gender;
						
				return str;
			}

			
			
}
