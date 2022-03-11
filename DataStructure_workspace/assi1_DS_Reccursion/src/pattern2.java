import java.util.Scanner;

public class pattern2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you required");
		int n = sc.nextInt();
		int i = 1;
		print_int(i, n);
		
		sc.close();
	}

	public static void print_int(int i, int n) {
		for (int j = 0; j < i; j++) {
			System.out.print(+i);
		}
			System.out.print("\n");
			if (i < n) {
				print_int(i + 1, n);
			}
			
			for(int j=0;j<i-1;j++)
			{
				System.out.print(+i-1);
			}
			System.out.print("\n");
			

		}
	}

