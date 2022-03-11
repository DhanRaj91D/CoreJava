import java.util.Scanner;

public class Uppercase {
	
	

	public static void main(String[] args) {
		Input [] input ;
		int noOfstr=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter how many Strings you want to save : ");
		noOfstr=sc.nextInt();
		input = new Input[noOfstr];
		
		populate_string(input,sc);
		
		for(int j=0;j<input.length;j++)
		{
			String v=input[j].toString();
			System.out.println(v.substring(0, 1).toUpperCase()+v.substring(1) );
			
		}
		
		
	}
	
	public static void populate_string(Input [] input ,Scanner sc)
	{
		
		for(int i=0;i<input.length;i++)
		{
			String inp="";
			
			System.out.println("Enter the String: ");
			inp=sc.next();
			
			input[i]=new Input(inp);
			
		}
		
	}
	
	
	

}
