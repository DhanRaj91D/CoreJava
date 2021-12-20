package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryHandling {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=0,n1=0,div=0;
		try {
		System.out.println("Enter the Divident :");
		n=sc.nextInt();
		
		System.out.println("Enter the Divisor :");
		 n1=sc.nextInt();
		 div=n/n1;
		}//end of try
		catch(ArithmeticException | InputMismatchException ae){
			
			System.out.println(" 1 "+ae);
		
		}//end of catch ae
		
		catch(Exception e){
		
			System.out.println(" 3 "+e);
		
		}//end of catch ae
		System.out.println("Devision = :"+div);
		sc.close();
	}

}
