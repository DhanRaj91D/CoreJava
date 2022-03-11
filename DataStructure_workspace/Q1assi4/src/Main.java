
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		

		int rad=0;
		System.out.println(" Enter the value for radius ");
		rad = s.nextInt();
		AreaCalculate a = new AreaCalculate(rad);
		
		a.area();
		a.circumference();
		s.close();
	}

}
