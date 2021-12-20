package study;
//Q3.Write a program that computes your initials from your full name and displays them.
import java.util.Scanner;

public class String9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String str=sc.nextLine();
		String[]name=str.split(" ");
		String n1=name[0].substring(0, 1);
		String n2=name[1].substring(0, 1);
		String n3=name[2].substring(0, 1);
		
		String initials=n1.concat("." + n2 + ".").concat(n3+".");
		System.out.println("Initials of name : "+initials.toUpperCase());
		sc.close();
	}
	
	

}
