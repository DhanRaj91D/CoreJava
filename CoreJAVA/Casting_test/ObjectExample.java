package study.Castingtest;

import java.util.Scanner;

import study.hasarelation.Circle;
import study.hasarelation.MyDate;
import study.hasarelation.Point;
import study.inheretance.Employee;

public class ObjectExample {
	
	public static void main(String[] args) {
		func1(new String("Dhanraj"));
		func1(new Circle(6, new Point(10, 15)));
		func1(new Employee(1, "Dhanraj", "Development", 158000, new MyDate(16, 05, 1998)));
		func1(new Scanner(System.in));
	}
	
	public static void func1(Object obj ) {
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		if(obj instanceof String)
		{
			System.out.println(((String) obj).toUpperCase());
		}
		
		if(obj instanceof Circle)
		{
			System.out.println(((Circle) obj).getRadius());
		}
		
		if(obj instanceof Scanner)
		{ 
			System.out.println("Enter the String :");
			String s= ((Scanner) obj).nextLine();
			System.out.println(s);
			/*Scanner s= (Scanner) obj;
			System.out.println(s.nextLine());*/
		}
		
		if(obj instanceof Employee)
		{
			System.out.println(((Employee) obj).getSalery());
		}
		
	}

}
