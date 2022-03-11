                 
public class Main {
	public static void main(String[] args) {

		int[] arr = new int[] { 4,6,8,10,12,14};
		int[] brr = new int[] { 5,7,9,11,13 };
		int size=arr.length+brr.length;
		int[] crr = new int[size];

		int a1, b1, c1;
		a1 = b1 = c1 = 0;
		while (a1 < arr.length && b1 < brr.length) {
			if (arr[a1] < brr[b1]) {
				crr[c1] = arr[a1];
				a1++;

			} else if (brr[b1] < arr[a1]) {

				crr[c1] = brr[b1];
				b1++;
			}

			else {

				crr[c1] = brr[b1];
				b1++;
				a1++;
			}

			c1++;

		}

		while (a1 < arr.length) {
			crr[c1] = arr[a1];
			c1++;
			a1++;
		}
		while (b1 < brr.length) {
			crr[c1] = arr[b1];
			c1++;
			b1++;
		}

		for (int i = 0; i < crr.length; i++) {

			System.out.print(crr[i]+", ");
		}

	}

}
