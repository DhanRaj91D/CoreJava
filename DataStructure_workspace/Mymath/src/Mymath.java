import java.util.Scanner;
public class Mymath {
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		
		Scanner n = new Scanner(System.in);
		int num1= n.nextInt();
		int num2= n.nextInt();
		
		Number number1 = new Number(num1);
		Number number2 = new Number(num2);

		Number result = Mathoperation.addition(number1, number2);
		System.out.println("Addition is : "+result);
		
		result = Mathoperation.substraction(number1, number2);
		System.out.println("Substraction is : "+result);
		
		result = Mathoperation.multiplication(number1, number2);
		System.out.println("Multiplication is : "+result);
		
		result = Mathoperation.division(number1, number2);
		System.out.println("Division is : "+result);
		n.close();
	}

}
