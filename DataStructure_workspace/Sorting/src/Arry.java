import java.util.Scanner;

public class Arry {

	public static void Populate(int[] arr) {
	
		Scanner sc = new Scanner(System.in);
		

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	public static void Print(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
	}
	

}
