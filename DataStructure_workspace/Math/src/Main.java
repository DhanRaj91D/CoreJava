import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mathutil [] mathutil ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for operation : ");
		int num =s.nextInt();
		mathutil = new Mathutil[1];
		int choice=0;
		
		while(true) {
		System.out.println("***************************************** ");
		System.out.println("****      Operation availabe         **** ");
		System.out.println("***************************************** ");
		System.out.println("*1.Square\n*2.Factorial\n*3.Prime or not\n4.First N prime no ");
		System.out.println("***************************************** ");
		System.out.println("*Enter your choice ");
		choice = s.nextInt();
		System.out.println("***************************************** ");	
		if(choice==5)
		{
			break;
		}
		
			switch(choice)
			{
			case 1 : System.out.println(Mathutil.getSquare(num));
			break;
			
			case 2 : System.out.println(Mathutil.getFactorial(num));
			break;
			
			case 3 : Mathutil.isPrime(num);
					System.out.println("\n");
					break;	
			case 4 :Mathutil.First_N_Prime(15);
			break;
		
			}
			
		
		}
		
		s.close();
		
		
		
	}

}
