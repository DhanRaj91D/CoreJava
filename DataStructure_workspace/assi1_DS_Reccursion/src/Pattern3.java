import java.util.Scanner;

public class Pattern3 {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		
		int n= sc.nextInt();
		int i=1;
		print_star(i,n);
		sc.close();
	}
	
	static void print_star(int i,int n)
	{
		
		for(int j=0;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		
		if(i<n)
		{
			print_star(i+1,n);
		}
		
		for(int j=0;j<i-1;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		
	}

}
