import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 1;

		print_pattern(i, n);
		sc.close();

	}

	static void print_pattern(int a, int b) {
		

		if (a < b) {
			System.out.print(+a + ",");
			print_pattern(a + 1, b);
			

		}

		

		System.out.print(+a + ",");
	}

}
