
public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 15, 2, 9, 6, 42, 6, 3, 45, 5 };

		selectionsortA(arr);
		printArry(arr);

		selectionsortD(arr);
		printArry(arr);

		insertionSortA(arr);
	    printArry(arr);

		insertionSortD(arr);
		printArry(arr);
		
		BubbleA(arr);
		printArry(arr);
		
		Bubble(arr);
		printArry(arr);
		

		
		

	}

	public static void selectionsortA(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < temp) {
					int x = arr[j];
					arr[j] = temp;
					temp = x;
				}

			}

			arr[i] = temp;
		}

	}

	public static void selectionsortD(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > temp) {
					int x = arr[j];
					arr[j] = temp;
					temp = x;
				}

			}

			arr[i] = temp;
		}

	}

	public static void insertionSortD(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int k = i - 1;
			while (k >= 0) {
				if (temp > arr[k]) {
					arr[k + 1] = arr[k];
					k--;

				} else
					break;

			}
			arr[k + 1] = temp;
		}
	}

	public static void insertionSortA(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int k = i - 1;
			while (k >= 0) {
				if (temp < arr[k]) {
					arr[k + 1] = arr[k];
					k--;

				} else
					break;

			}
			arr[k + 1] = temp;
		}
	}

	public static void BubbleA(int[] arr) {
		int i, j, exchange, temp, n = arr.length - 1;

		for (i = 0; i < n; i++) {
			exchange = 0;
			for (j = 0; j < n - i; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					exchange++;

				}
			}

			if (exchange == 0)
				break;
		}

	}

	public static void Bubble(int[] arr) {
		int i, j, exchange, temp, n = arr.length - 1;

		for (i = 0; i < n; i++) {
			exchange = 0;
			for (j = 0; j < n - i; j++) {

				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					exchange++;

				}
			}
		

			if (exchange == 0)
				break;
		}
	}
		
		
		
	public static void printArry(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}
