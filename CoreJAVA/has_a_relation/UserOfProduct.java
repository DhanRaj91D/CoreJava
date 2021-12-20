package study.hasarelation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class UserOfProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd" + "MM" + "yyyy");
		Date date = new Date();
		System.out.println(formatter.format(date));
		System.out.println("Enter the no of product you want to enter ");
		int size = sc.nextInt();
		Product[] arr = new Product[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = populateProduct(sc);
		}

		

		System.out.println("Enter the Product name and quantity you want : ");
		String productName = sc.nextLine();
		int qty = sc.nextInt();
		printBill(productName, qty);

	}

	private static boolean isExpire(MyDate myDate) {
		GregorianCalendar d = new GregorianCalendar();
		int year = d.get(Calendar.YEAR);
		int month = d.get(Calendar.MONTH);
		int day = d.get(Calendar.DAY_OF_MONTH);

		if (myDate.getYear() > year) {

			return true;

		} else if (myDate.getYear() == year) {

			if (myDate.getMonth() < month) {

				if (myDate.getDay() < day) {
					return false;

				} else {
					return true;
				}

			} else
				return true;
		}

		else
			return true;

	}

	private static void printBill(String productName, int qty) {
		
		

	}

	private static Product populateProduct(Scanner sc) {
		System.out.println("Enter the Product name: ");
		String productName = sc.nextLine();
		System.out.println("Enter the Discription: ");
		String discription = sc.nextLine();
		System.out.println("Enter the cost of product : ");
		int cost = sc.nextInt();
		System.out.println("Enter the dateOfExpiryin dd mm yyyy format : ");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		Product product = new Product(productName, discription, cost, new MyDate(d, m, y));
		return product;
	}

}
