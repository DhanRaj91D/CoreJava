import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int size = 0;
		System.out.println("Enter the size of arry you want :");
		size = sc.nextInt();
		System.out.println("Enter " + size + " arry element ");
		arr = new int[size];
		Arry.Populate(arr);

		Arry.Print(arr);
		Sorting.Bubble(arr, true);
		Arry.Print(arr);
		//Sorting.insertionSort(arr, true);
		//Arry.Print(arr);
		//Sorting.Quick(arr);
		//Arry.Print(arr);
		//Sorting.selectionsort(arr, true);
		//Arry.Print(arr);
		sc.close();
	}

}
