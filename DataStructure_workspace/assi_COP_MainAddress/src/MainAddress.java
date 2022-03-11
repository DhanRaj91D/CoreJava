/*1	Q1.Write a class Address having attributes String flatNo,bldName,area,city,state,country,pincode.
	Write a no-args and parameterized constructor.
	Display everything using toString() and return it as a string.
	Write a MainAddress class in that write main method to create an Address class object ,
	using parameterized constructor and show details.*/

import java.util.Scanner;

public class MainAddress {

	public static void main(String[] args) {
		int size = 0;
		System.out.println("How many address you want to store :");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		Address[] address;
		address = new Address[size];
		populate_Add(address);
		display(address);
		sc.close();
	}

	public static void populate_Add(Address[] address) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < address.length; i++) {
			String flatno = "";
			String buildingname = "";
			String area = "";
			String city = "";
			String state = "";
			String country = "";
			String pincode = "";

			System.out.println("Enter the Flat no : ");
			flatno = sc.nextLine();

			System.out.println("Enter the Building name : ");
			buildingname = sc.nextLine();

			System.out.println("Enter the Area : ");
			area = sc.nextLine();

			System.out.println("Enter the name of city : ");
			city = sc.nextLine();

			System.out.println("Enter the name of State : ");
			state = sc.nextLine();

			System.out.println("Enter the name of counry : ");
			country = sc.nextLine();

			System.out.println("Enter the pincode : ");
			pincode = sc.nextLine();

			address[i] = new Address(flatno, buildingname, area, city, state, country, pincode);
			sc.close();
		}

	}

	static void display(Address[] address) {

		for (int i = 0; i < address.length; i++) {
			System.out.println(address[i] + " ");

		}
		System.out.print(" \n");

	}

}
