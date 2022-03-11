/*create another class MainEmpUser in that class In
 public static void main(String args[])
	  create an employee array of size entered by user
	  in a loop accept the employee details for each employee and create an Employee object 
	  add the object to the array after completing this---
	in another loop show details of all the employees entered in the array.*/
import java.util.Scanner;

public class MainEmpUser {
			
			public static void main(String[] args) {
			
				EmpQueue q1 = new EmpQueue(3);
				
				Employee e1 =accept();
				q1.insert(e1);
				Employee e2 =accept();
				q1.insert(e2);
				System.out.println(q1);
				
		}
	static Employee accept()
	
	{
		int i=0;
		String n= "";
		int s=0;
		int d=0;
		int m=0;
		int y=0;
		
		
			Scanner e = new Scanner(System.in);
			
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
			
			Employee e1 = new Employee(i,n,s,d,m,y);
			e.close();
			return e1;
			
			}
		
	
		
	}


