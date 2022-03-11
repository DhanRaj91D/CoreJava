

public class Employee {
			private int EmpId;
			private String name;
			private int salary;
			
			
			Employee(int i, String n, int s, int d, int m,int y )
			{
				EmpId=i;
				name=n;
				salary=s;
				
			
			}
			
			public String toString()
			{		
				String str = "Employee Id :" + EmpId + ",\nName:" + name + ", \nSalary : " + salary ;
						
				return str;
			}
			
}
