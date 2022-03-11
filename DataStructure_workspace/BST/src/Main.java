import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Tree t = new Tree();

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("**************** Welcome *************");
		while (true) {

			ShowMenue(sc);
			choice = sc.nextInt();
			System.out.println("");
			System.out.println("");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");

			if (choice == 9) {
				break;
			}
			switch (choice)

			{

			case 1:
				System.out.println(" Enter value to insert in tree :");
				int value = sc.nextInt();
				t.insert(value);
				break;

			case 2:
				System.out.println("Enter the data : ");
				int data = sc.nextInt();
				t.insert_rec(t, data);
				break;

			case 3:
				t.preorder_print();
				break;

			case 4:
				t.inorder_print();
				break;

			case 5:
				t.postorder_print();
				break;

			case 6:
				System.out.println("Enter the value : ");
				int value1 = sc.nextInt();
				t.search(value1);
				break;

			case 7:
				t.printlargest_val();
				break;

			case 8:
				t.printsmallest_val();
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
		System.out
				.println("*\n1.Insert \n2.Insert Rec\n3.preorder print\n4.Inorder print\n5.Post order print\n6.search\n7.Find largest element\n8.Find smallest element\n9.Exit ");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");

		System.out.println("*******************************************");

	}

}
