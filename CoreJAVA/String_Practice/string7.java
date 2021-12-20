package study;

/*Q1.Write a program that takes your full name as input and displays the abbreviations of 
the first and middle names except the last name which is displayed as it is.
 For example, if your name is Sneha Amod Parchure, then the output should be S.A.Parchure.*/
import java.util.Scanner;
public class string7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name : ");
		String name= sc.nextLine();
		
		String [] n=name.split(" ");
		String n1=n[0].substring(0,1);
		String n2=n[1].substring(0, 1);
		
		String ab=n1.concat("."+n2+".").concat(n[2]+".");
		System.out.println(ab);
		
		
		sc.close();
	}
}
