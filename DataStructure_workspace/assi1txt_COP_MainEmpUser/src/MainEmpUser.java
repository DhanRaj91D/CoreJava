/*create another class MainEmpUser in that class In
 public static void main(String args[])
	  create an employee array of size entered by user
	  in a loop accept the employee details for each employee and create an Employee object 
	  add the object to the array after completing this---
	in another loop show details of all the employees entered in the array.*/
import java.util.Scanner;

public class MainEmpUser {
			
			public static void main(String[] args) {
				
			Employee [] employees;
			int noOfEmpolyee=0;
			Scanner e = new Scanner(System.in);
			
			System.out.println("Enter the no of Employee");
			noOfEmpolyee =e.nextInt();
   			employees = new Employee[noOfEmpolyee];
   			
			accept(employees,e);
			
			for(int j =0;j<employees.length;j++)
			{
			System.out.println(employees[j]);
			}
		
		}
	static void accept(Employee [] employees, Scanner e)
	{
		int i=0;
		String n= "";
		int s=0;
		int d=0;
		int m=0;
		int y=0;
		
		
			
			
		for(int a=0; a< employees.length ;a++)
			{
			
			
			System.out.println("Enter the Employee Id : ");
			i= e.nextInt();     
			
			System.out.println("Enter the Name : ");
			n= e.next();
					
			System.out.println("Enter the Salary : ");
			s= e.nextInt();
			
			System.out.println("Enter date in dd mm yyyy :");
			d=e.nextInt();
			m=e.nextInt();
			y=e.nextInt();
			
			employees[a] = new Employee(i,n,s,d,m,y);
			
			
			}
		
		
	}

}
