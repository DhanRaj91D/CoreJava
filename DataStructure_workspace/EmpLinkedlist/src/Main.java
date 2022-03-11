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

			if (choice == 14) {
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
				System.out.println("Enter Emp Details  : ");
				Employee e1=Populate_emp(sc);
				L1.append(e1);
				System.out.println("Inserted sucsessfully: ");
				break;

			case 3:
				System.out.println("Enter Employee details : ");
				Employee e2=Populate_emp(sc);
				System.out.println("Enter the position");
				int pos = sc.nextInt();
				L1.insert_By_pos(e2, pos);
				System.out.println("Inserted sucsessfully: ");
				break;

			case 4:
				L1.delete_first();
				break;

			case 5:
				L1.delet_last();
				break;

			case 6:
				System.out.println("Enter the position which you want to delete  : ");
				int pos1 = sc.nextInt();
				L1.delete_By_Pos(pos1);
				break;

			case 7:
				L1.reverse();
				break;

			case 8:
				System.out.println(L1);
				break;
				
			case 9: System.out.println("Enter the ID : ");
				int id=sc.nextInt();
				L1.details_by_ID(id);
				break;
				

			case 10:
				System.out.println("Enter the Salery to find employes having salery <  : ");
				int sal=sc.nextInt();
				L1.Salary_less_than(sal);
				break;
				
			case 11 :
				System.out.println("Enter the character to find employes name start with letter 'a' : ");
				char c=sc.next().charAt(0);
				L1.name_Startwith(c);
				break;
				
			case 12 :
				System.out.println("Warning Your data will get deleted press ok to contineu");
				String a = sc.next();
				if(a .equals("ok"))
				L1.Delete_data();
				break;
				
			case 13:
				System.out.println("Warning Your Linklist will get deleted press ok to contineu");
			String b = sc.next();
			if(b .equals("ok"))
			L1.delete_LL();
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
		System.out.println("Enter the Employee Id : ");
		i= sc.nextInt();     
		
		System.out.println("Enter the Name : ");
		n= sc.next();
				
		System.out.println("Enter the Salary : ");
		s= sc.nextInt();
		Employee e= new Employee(i,n,s);
		return e ;
		
	}
	

	private static void ShowMenue(Scanner sc) {

		System.out.println("*******************************************");
		System.out.println("*            Operations avilable          *");
		System.out.println("*******************************************");
		System.out.println(
				"*\n1.Insert \n2.Append\n3.Insert by position\n4.Delet first node\n5.Delete last node\n6.Delete node by position\n7.Reverse Linklist\n8.Display\n9.Employee details by ID\n10.Employees having salery less than\n11.Name start from\n12.Delete data\n13.Delete Linklist\n14.Break ");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");

		System.out.println("*******************************************");

	}

}
