import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EmpLL l = new EmpLL();
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			int choice = 0;
			Show_menue();
			choice = sc.nextInt();

			if (choice == 9) {
				break;
			}
			switch (choice) {

			case 1:
				Employee e1 = populate(sc);
				l.insert(e1);
				break;

			case 2:
				Employee e = populate(sc);
				l.append(e);
				break;
			case 3:
				Employee e2 = populate(sc);
				System.out.println("Enter the position : ");
				int pos = sc.nextInt();
				l.set_by_pos(e2, pos);
				break;
			case 4:
				l.delet_first();
				break;
			case 5:
				l.delet_last();
				break;
			case 6:
				System.out.println("Enter the position : ");
				int pos1 = sc.nextInt();
				l.delete_by_pos(pos1);
				break;

			case 7:
				l.reverse();
				break;
				
			case 8:System.out.println(l);
				break;
				
			default:
				System.out.println("Invalid entry");
				break;

			}
		}

	}

	private static void Show_menue() {
		System.out.println("**********Welcome*********");
		System.out.println("**************************");
		System.out.println("*******Operation available*******");
		System.out.println();
		System.out.println(
				"\n1.Inser\n2.append\n3.insert by position \n4.delet\n5.delet last\n6.delet by position\n7.reverse\n8.Display\n9.break");
		System.out.println("**************************");
		System.out.println("Enter the choice");
		System.out.println();
	}

	private static Employee populate(Scanner sc) {

		int i = 0;
		String n = "";
		int a = 0;
		char g;

		System.out.println("Enter the Employee id :");
		i = sc.nextInt();
		System.out.println("Enter the name of employee ");
		n = sc.next();
		System.out.println("Enter the age of employee:");
		a = sc.nextInt();
		System.out.println("Enter the gender of employee ");
		g = sc.next().charAt(0);

		Employee e = new Employee(i, n, a, g);

		return e;
	}

}
