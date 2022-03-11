
//1).Program to print hostogram of vowels for an user input string.

import java.util.Scanner;

public class Histogram {

	public static void main(String []args)
	{
		Findvowels [] findvowels;
		int noOfstring = 0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the no of strings you want : ");
		noOfstring =s.nextInt();
		findvowels =new Findvowels[noOfstring];
		
		accept_string(findvowels, s);
		
		for(int j=0;j<findvowels.length;j++)
		{
			
			String v=findvowels[j].toString();
			System.out.println( ""+ v  );
			find(v);
			/*for(int i=1;i<v.length();i++)
			{
				if((v.charAt(i)=='a')||(v.charAt(i)=='A')||(v.charAt(i)=='e')||(v.charAt(i)=='E')||(v.charAt(i)=='i')||(v.charAt(i)=='I')||(v.charAt(i)=='o')||(v.charAt(i)=='O')||(v.charAt(i)=='u')||(v.charAt(i)=='U'))
				{
					System.out.println(""  +v.charAt(i));
					
				}
			}*/
	        
	   }
	
	}
	public static void accept_string(Findvowels []findvowels, Scanner s)
	
	{
	
				
		for(int i=0; i<findvowels.length;i++)
		{
			String v ="";
			
			System.out.println("Enter the string "+i+ " : " );
			v=s.next();
				
			findvowels[i]=new Findvowels(v);
			
		}
		
		
	}
	
	public static void find(String v)
	{
		for(int i=1;i<v.length();i++)
		{
			if((v.charAt(i)=='a')||(v.charAt(i)=='A')||(v.charAt(i)=='e')||(v.charAt(i)=='E')||(v.charAt(i)=='i')||(v.charAt(i)=='I')||(v.charAt(i)=='o')||(v.charAt(i)=='O')||(v.charAt(i)=='u')||(v.charAt(i)=='U'))
			{
				System.out.println(""  +v.charAt(i));
				
			}
		}
	}
	
}
