package study;
import java.util.Scanner;
public class Stringbuffer1 {
	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check pelendrome : ");
		str=str.append(sc.nextLine());
		StringBuffer temp=new StringBuffer(str);
		System.out.println(str);
		str.reverse();
		
		System.out.println(str);
		
		if(temp.toString().equals(str.toString()))
			System.out.println("String is pelendrome");
		
		else
			System.out.println("String is not pelendrome");
			
		sc.close();
		
	}

	
}
