/*Write a class Employee having fields id, name ,salary
write no-args and parameterized constructor  and 
showEmpDetails  function--- show the info in the class*/

public class Employee {
			private int fildId;
			private String name;
			private int salary;
			private Dateofbirth dob;
			
			
			Employee()
			{
			
			}
			
			Employee(int i, String n, int s, int d, int m,int y )
			{
				fildId=i;
				name=n;
				salary=s;
				dob = new Dateofbirth(d,m,y);
				
			
			}
			
			public String toString()
			{		
				String str = "\nEmployee Id :" + fildId + ",\nName:" + name + ", \nSalary : " + salary+ ", \nDate of Birth" + dob + ", ";
						
				return str;
			}
			
}
