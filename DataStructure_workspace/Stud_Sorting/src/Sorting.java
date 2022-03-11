
public class Sorting {

	public static void Quick(Student[] arr, boolean isDes) {
		quicksort(arr, 0, arr.length - 1, isDes);
	}

	private static void quicksort(Student[] arr, int l, int h, boolean isDes) {
		if (l < h) {
			int loc = partition(arr, l, h, isDes);

			quicksort(arr, l, loc - 1, isDes);

			quicksort(arr, loc + 1, h, isDes);
		}
	}

	private static int partition(Student[] arr, int l, int h, boolean isDes) {

		int j = l;
		int i = j - 1;

		while (j <= h) {

			if (isDes) {
				if (arr[j].getRollno() > arr[h].getRollno()) {
					i++;
					Student tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			} 
			
			else {
				if (arr[j].getRollno() < arr[h].getRollno()) {
					i++;
					Student tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			j++;
		}
		i++;
		Student tmp = arr[i];
		arr[i] = arr[h];
		arr[h] = tmp;

		return i;
	}

}
