package study.hasarelation;

import java.util.Scanner;

public class UserCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many circle you want to create :");
		int size = sc.nextInt();
		Circle[] arr = new Circle[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = populateCircle(sc);
		}
		showRad(arr);
		yCordinateIsbetween(arr);
		showYcordinate(arr);

	}

	private static void showYcordinate(Circle[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Y cordinate of Circle "+ (i+1) + "= "+arr[i].getCenter().getY());
		}
		
	}

	private static void yCordinateIsbetween(Circle[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getCenter().getY()>=10 && arr[i].getCenter().getY()<=90)
			{
				System.out.println("Radius of Circle "+ (i+1) + "= "+arr[i].getRadius()+" and Center = "+arr[i].getCenter());
			}
			  
		}
	}

	private static void showRad(Circle[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Radius of Circle "+ (i+1) + "= "+arr[i].getRadius());
		}

	}

	private static Circle populateCircle(Scanner sc) {

		System.out.println("Enter the radius :");
		int red = sc.nextInt();
		System.out.println("Enter the point1 :");
		int p1 = sc.nextInt();
		System.out.println("Enter the point2 :");
		int p2 = sc.nextInt();

		Circle circle = new Circle(red, new Point(p1, p2));
		return circle;

	}

}
