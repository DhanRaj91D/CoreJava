package study;
//Q4.Input a String from user and remove particular character from string.
import java.util.Scanner;
public class String10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str= sc.nextLine();
		
		System.out.println("Enter the character you want to remove : ");
		String ch=sc.next();
		
		String []str1=str.split(ch);
		
	 String nstr=str1[0] + str1[1];
	 System.out.println(nstr);
	 
		/*for(int i=0;i<str.length();i++)
		{
			str.charAt(i);
			
		}*/
		sc.close();
	}
	

}
