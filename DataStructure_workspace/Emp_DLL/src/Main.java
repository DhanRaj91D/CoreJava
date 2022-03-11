import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		EmpLinklist L1 = new EmpLinklist();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

	

		System.out.println("**************** Welcome *************");
		
		while (true) {

			ShowMenue(sc);
			choice = sc.nextInt();
			System.out.println("");
			System.out.println("");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");

			if (choice == 7) {
				break;
			}
			switch (choice)

			{

			case 1:
				System.out.println("Enter Emp Details  : ");
				Employee e=Populate_emp(sc);
				L1.insert(e);
				System.out.println("Inserted sucsessfully: ");
				break;

			case 2:
				L1.remove();
				System.out.println("removed sucsessfully: ");
				break;
				
			case 3:
				L1.empty_Queue();
				System.out.println("LL Queue is empty ");
				break;
				
			case 4:
				System.out.println("Enter the gender : ");
				char c= sc.next().charAt(0);
				L1.emp_by_Gender(c);
				break;
				
			case 5: 
				System.out.println(L1);
				break;
				
			case 6: 
				
				if(L1.is_Empty())
				System.out.println("L1 is empty");
				
				else
					System.out.println("Not empty");
				break;
				
				
				
			default:
				System.out.println("invalid entry");
				break;

			}

		}
	}
	
	private static Employee Populate_emp(Scanner sc)
	{
		int i=0;
		String n="";
		int s=0;
		char g;
		System.out.println("Enter the Employee Id : ");
		i= sc.nextInt();     
		
		System.out.println("Enter the Name : ");
		n= sc.next();
				
		System.out.println("Enter the Salary : ");
		s= sc.nextInt();
		
		System.out.println("Enter the gender : ");
		g= sc.next().charAt(0);
		
		Employee e= new Employee(i,n,s,g);
		return e ;
		
	}
	

	private static void ShowMenue(Scanner sc) {

		System.out.println("*******************************************");
		System.out.println("*            Operations avilable          *");
		System.out.println("*******************************************");
		System.out.println(
				"*\n1.Insert \n2.Remove\n3.empty Queue \n4.Search employee by gender\n5.Print all emp\n6.isEmpty\n7.Exit ");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");

		System.out.println("*******************************************");

	}

}


