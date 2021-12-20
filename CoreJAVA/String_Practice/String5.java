package study;

import java.util.Scanner;

public class String5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your name:");
			String name = sc.nextLine();
			if(name.equalsIgnoreCase("quit"))
				break;

			String[] name1 = name.split(" ");

			String f1 = name1[0].substring(0, 1);
			String f2 = name1[0].substring(1, name1[0].length());

			String fn = f1.toUpperCase() + f2.toLowerCase();

			String l1 = name1[1].substring(0, 1);
			String l2 = name1[1].substring(1, name1[1].length());

			String ln = l1.toUpperCase() + l2.toLowerCase();

			System.out.println("Welcome " + fn + " " + ln);

		}sc.close();
	}
	
}
