import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		JavaLoop []javaloop;
	
		System.out.println("Enter two numbers ");
		
		Scanner n = new Scanner(System.in);
		int num1= n.nextInt();
		int num2= n.nextInt();
		JavaLoop.isPrime(num1);
		JavaLoop.power(num1, num2);
		JavaLoop.fibonacci(100);
		n.close();
}		

}
