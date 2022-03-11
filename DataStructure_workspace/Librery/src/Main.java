import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BookLL l = new BookLL();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("**************** Welcome *************");
		while (true) {

			ShowMenue(sc);
			choice = sc.nextInt();
			System.out.println("");
			System.out.println("");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");

			if (choice == 5) {
				break;
			}
			switch (choice)

			{

			case 1:
				System.out.println("Insert details :");
				l.append(Populate(sc));
				break;

			case 2:
				System.out.println(l);
				break;

			case 3:
				System.out.println("Enter book ID :");
				l.update_qty(sc.nextInt());
				break;

			case 4:
				l.delete_all();
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
		System.out.println("*\n1.Insert at end \n2.Display all books\n3.Update Quantity\n4.Delet all\n5.Exit ");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");

		System.out.println("*******************************************");

	}

	private static Book Populate(Scanner sc) {

		int bookID;
		String bookName;
		int price;
		int qty;

		System.out.println("Enter the Book Id : ");
		bookID = sc.nextInt();

		System.out.println("Enter the Book Name : ");
		bookName = sc.next();

		System.out.println("Enter the price : ");
		price = sc.nextInt();

		System.out.println("Enter the Qty : ");
		qty = sc.nextInt();

		Book b = new Book(bookID, bookName, price, qty);
		return b;

	}

}
