import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many element you want in stack : ");
		int size=sc.nextInt();
		Stack s = new Stack(size);

		
		int choice = 0;

		System.out.println("**************** Welcome *************");

		while (true) {

			ShowMenue(sc);
			choice = sc.nextInt();
			System.out.println("");
			System.out.println("");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");

			if (choice == 6) {
				break;
			}
			switch (choice)

			{

			case 1:
				System.out.println("Enter value to push in stack");
				int value = sc.nextInt();
				s.push(value);
				break;

			case 2:
				s.pop();
				break;

			case 3:
				System.out.println(s);
				break;

			case 4:
				s.peep();
				break;

			case 5:
				s.PrintOdd();
				break;

			default:
				System.out.println("Invalid input");
				break;

			}

		}

	}

	private static void ShowMenue(Scanner sc) {

		System.out.println("*******************************************");
		System.out.println("*            Operations avilable          *");
		System.out.println("*******************************************");
		System.out.println("*\n1.Push \n2.Pop\n3.Display\n4.Peep\n5.PrintOdd\n6.Exit ");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");

		System.out.println("*******************************************");

	}

}
