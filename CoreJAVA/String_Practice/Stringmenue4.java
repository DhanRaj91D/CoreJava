package study;

import java.util.Scanner;

public class Stringmenue4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Create string to perform operation: ");
		String str = sc.nextLine();

		while (true) {

			System.out.println("Operations");
			System.out.println("1.Length of string");
			System.out.println("2.Substring");
			System.out.println("3.Is pelendrome");
			System.out.println("4.Quit");

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			if (choice == 4)
				break;

			switch (choice) {

			case 1:
				System.out.println("length of string is :" + str.length());
				break;

			case 2:
				System.out.println("Enter the begin and end index to find substring : ");
				int beginIndex = sc.nextInt();
				int endIndex = sc.nextInt();
				String sub = str.substring(beginIndex, endIndex);
				System.out.println(sub);
				break;

			case 3:
				String str2 = "";
				for (int i = str.length() - 1; i >= 0; i--) {
					char ch = str.charAt(i);
					str2 = str2 + ch;
				}

				if (str.toLowerCase().equals(str2.toLowerCase()))
					System.out.println("String is pelendrome");
				else
					System.out.println("String is not pelendrome");

				System.out.println(str2);
				break;

			}
			
			sc.close();

		}
	}

}
