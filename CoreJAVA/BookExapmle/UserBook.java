package BookExapmle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<>();

		boolean flag = true;
		while (flag) {

			System.out.println("Operations available: ");
			System.out.println("********************************");
			System.out.println("1. Add Book to list\r\n" + "2. Remove Book list\r\n" + "3. Show all Books\r\n"
					+ "4. Show all Books in sorted order (sort on the basis of bookCost)\r\n"
					+ "5. Find a book with bookName\r\n" + "6. Save all Books details into file \r\n" + "7. Quit\r\n"
					+ "");
			System.out.println("********************************");

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Did you want to enter auther name Y/N ?");
				String option = sc.next();
				if (option.equalsIgnoreCase("y")) {
					list.add(populatebook(sc));

				} else if (option.equalsIgnoreCase("n")) {
					list.add(populatebookwithoutauther(sc));
				}

				System.out.println("Book added sucsessfully.....");

				break;

			case 2:
				sc.nextLine();
				System.out.println("Enter the book name to Remove book : ");
				String removebook = sc.nextLine();
				Iterator<Book> it1 = list.iterator();
				while (it1.hasNext()) {
					Book temp = it1.next();
					if (removebook.equalsIgnoreCase(temp.getBookName())) {
						it1.remove();

					}
				}

				break;

			case 3:
				System.out.println("All books from list are : ");
				Iterator<Book> it = list.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;

			case 4:
				
				list.sort(new SortbyCost());//sorting done for list by cost
				System.out.println("List sorted by cost......");

				break;

			case 5:
				sc.nextLine();
				System.out.println("Enter the book name to find book : ");
				String bookname = sc.nextLine();
				Iterator<Book> it2 = list.iterator();
				while (it2.hasNext()) {
					Book temp = it2.next();
					if (bookname.equalsIgnoreCase(temp.getBookName())) {
						System.out.println(temp);

					}
				}

				break;

			case 6:

				BookIOOperation.writeToFile(list);
				System.out.println("Book saved in file sucessfully.......");
				flag = false;
				break;
				
			case 7: System.out.println("Byee......");
				flag=false;
				break;

			default:
				break;
			}// end of switch

		} // end of while

	}// end of main

	private static Book populatebook(Scanner sc) {
		sc.nextLine();
		System.out.println("enter the bookname :");
		String bookName = sc.nextLine();
		System.out.println("Enter the book cost : ");
		double bookCost = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the auther name : ");
		String authorName = sc.nextLine();

		return new Book(bookName, bookCost, authorName);
	}// end of populate method

	private static Book populatebookwithoutauther(Scanner sc) {
		sc.nextLine();
		System.out.println("enter the bookname :");
		String bookName = sc.nextLine();
		System.out.println("Enter the book cost : ");
		double bookCost = sc.nextDouble();

		return new Book(bookName, bookCost);
	}// end of populate method without auther

}// end of user
