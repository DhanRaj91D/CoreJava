package study.hasarelation;

import java.util.Scanner;

public class UserOfBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arry :");
		int size = sc.nextInt();

		Book[] arr = new Book[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = populateBook(sc);
		}
		ShowBooknameCost(arr);
		System.out.println("*************************************");
		System.out.println("Total Cost = " + totalCost(arr));
		System.out.println("*************************************");
		ShowBooknameAuther(arr);
		System.out.println("*************************************");
		ShowBookwith1Auther(arr);
		System.out.println("*************************************");

	}

	private static void ShowBookwith1Auther(Book[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getAuthors().length == 1)
				System.out.println((i + 1) + ".Bookname : " + arr[i].getBookname());

		}

	}

	private static void ShowBooknameAuther(Book[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println((i + 1) + ".Bookname : " + arr[i].getBookname());
			String[] str = arr[i].getAuthors();
			for (int j = 0; j < str.length; j++) {
				System.out.println("Authors : " + str[j]);
			}
		}

	}

	private static int totalCost(Book[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res = arr[i].getCost() + res;
		}
		return res;

	}

	private static void ShowBooknameCost(Book[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ".Bookname : " + arr[i].getBookname() + " and Cost : " + arr[i].getCost());
		}

	}

	private static Book populateBook(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter the Book name : ");
		String bookname = sc.nextLine();
		System.out.println("Enter the cost of book : ");
		int cost = sc.nextInt();
		System.out.println("Enter the number of authors: ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] authors = new String[size];
		for (int i = 0; i < authors.length; i++) {
			authors[i] = sc.nextLine();
		}

		Book book = new Book(bookname, cost, authors);
		return book;
	}

}
