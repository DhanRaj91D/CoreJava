package study.polymorphism;

import java.util.Scanner;

public class UserMainInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sellable[]arr=new Sellable[2];
		
		//arr [0]=new CD("SAregama", "Audio", 100.50, 1.3, "Sonu nigam");
		arr[1]=new Laptop("HP", 16, 1000, "i5 processer", 64000);
	//	arr[0]=populate(sc);
		arr[0].setDiscount(10);
		System.out.println(arr[0]);
		System.out.println(arr[0].getSellingPrice());
		
		arr[1].setDiscount(20);
		System.out.println(arr[1]);
		System.out.println(arr[1].getSellingPrice());
		sc.close();
	}

/*	private static Sellable populate(Scanner sc) {
		System.out.println("Enter the Product name : ");
		String pro=sc.next();
		if(pro.equals("CD")) {
			System.out.println("Enter CD details");
			System.out.println("Enter the ");
			String name=sc.nextLine();
			
			
			return new CD(name, type, cost, duration, artist);
		}
		else if(pro.equals("Laptop")) {
			
		}
		
	}*/

}
