package study.practiceExample;

import java.util.Scanner;

public class UserLibrery {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library book=new Library();
	
		
		
		boolean flag = true;
		while (flag) {
			System.out.println("********************************************");
			System.out.println("Operation available");
			System.out.println("********************************************");
			System.out.println("1.Add Book)");
			System.out.println("2.Sortby book name)");
			System.out.println("3.sort by auther name  ");
			System.out.println("********************************************");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			if (flag == false)
				break;

			switch (choice) {

			
			case 1: 
				
				break;
			
			case 2: 
				break;
			
			case 3: 
				break;
			
			
				
			default: {
				System.out.println("Wrong input");
			}

			}// end of swith

		}
	 
	}

	private static Book populateBook(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter name of Book : ");
		String bookname =sc.nextLine();
		System.out.println("Enter the Auyther name : ");
		String auther=sc.nextLine();
		System.out.println("Enter the cost of Book :");
		double cost =sc.nextDouble();
		return new Book(bookname, auther, cost);
	}

}
