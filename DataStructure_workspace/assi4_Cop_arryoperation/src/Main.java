
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the size of arry : ");
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int num = sc.nextInt();
		int choice = 0;
		arr = new int[num];
		populate_arry(arr, sc);
		display(arr);

		while (true) {
			System.out.println("*******************************************");
			System.out.println("*            Operations avilable          *");
			System.out.println("*******************************************");
			System.out.println("*\n1.Left rotate\n2.Right rotate\n3.Insert\n4.Delete\n5.Sorting\n6.Break ");
			System.out.println("*******************************************");
			System.out.println("*******************************************");
			System.out.println("*Enter your choice                        *");
			choice = sc.nextInt();
			System.out.println("*******************************************");
			if (choice == 6) {
				break;
			}
			switch (choice)

			{
			case 1:
				left_rotate(arr);
				display(arr);
				break;

			case 2:
				right_rotate(arr);
				display(arr);
				break;

			case 3:
				insert_arr(arr, 2, 3);
				display(arr);
				break;

			case 4:
				delete_arr(arr, 3);
				display(arr);
				break;

			case 5:
				sort_arr(arr);
				display(arr);

			case 6:
				break;

			}

			System.out.println("");
		}

	}

	static void populate_arry(int[] brr, Scanner sc) {
		System.out.print("Enter the values in arry : ");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();

		}

	}

	static void display(int[] brr) {
		System.out.println("\nvalues in arry : ");
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");

		}
		System.out.println();
	}

	static void left_rotate(int brr[]) {
		System.out.print("\nLeft rotate : ");
		int i = 0;
		int temp = brr[0];
		for (i = 0; i < brr.length - 1; i++) {
			brr[i] = brr[i + 1];
		}

		brr[i] = temp;

	}

	static void right_rotate(int brr[]) {
		System.out.print("\nRight rotate : ");
		int i = 0;
		int temp = brr[brr.length - 1];
		for (i = brr.length - 1; i > 0; i--) {
			brr[i] = brr[i - 1];
		}

		brr[i] = temp;

	}

	static void insert_arr(int brr[], int pos, int key) {
		System.out.print("\nInsert : ");
		display(brr);
		System.out.print("\nYour arry length is " + brr.length);

		int i;
		for (i = brr.length - 1; i >= pos; i--) {
			brr[i] = brr[i - 1];
		}
		brr[i] = key;
	}

	static void delete_arr(int brr[], int pos) {
		System.out.print("\nDelete : ");
		int i;
		for (i = pos - 1; i > brr.length; i++) {
			brr[i] = brr[i + 1];
		}
		brr[i] = 0;
	}

	static void sort_arr(int[] arr) {

		System.out.print("\nSorting :  ");
		int i, j, temp;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
