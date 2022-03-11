        
public class Sorting {

	public static void selectionsort(int[] arr, boolean isDes) {

		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {

				if (isDes) {
					if (arr[j] > temp) {
						int x = arr[j];
						arr[j] = temp;
						temp = x;
					}
				} else {
					if (arr[j] < temp) {
						int x = arr[j];
						arr[j] = temp;
						temp = x;
					}
				}

			}

			arr[i] = temp;
		}

	}

	public static void insertionSort(int[] arr, boolean isDes) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int k = i - 1;
			while (k >= 0) {

				if (isDes) {
					if (temp > arr[k]) {
						arr[k + 1] = arr[k];
						k--;

					} else
						break;

				} else {
					if (temp < arr[k]) {
						arr[k + 1] = arr[k];
						k--;

					} else
						break;
				}

			}
			arr[k + 1] = temp;
		}
	}
    
	public static void Bubble(int[] arr, boolean isDes) {
	
		for(int i=0;i<arr.length-1;i++)
			for(int j =0;j<arr.length-1;j++)
			{
				if(isDes)
				{
					if(arr[j+1] > arr[j])
					{
						int x=arr[j + 1];
						arr[j+1]=arr[j];
						arr[j]=x;
						
					}
					
				}
				
				else
				{
					if(arr[j+1] < arr[j])
					{
						int x=arr[j + 1];
						arr[j+1]=arr[j];
						arr[j]=x;
						
					}
				}
			}
		
		
	}

	public static void Quick(int[] arr) {
		quicksort(arr, 0, arr.length - 1);
	}

	private static void quicksort(int[] arr, int l, int h) {
		if (l < h) {
			int loc = partition(arr, l, h);

			quicksort(arr, l, loc - 1);

			quicksort(arr, loc + 1, h);
		}
	}

	private static int partition(int[] arr, int l, int h) {

		int j = l;
		int i = j - 1;

		while (j <= h) {
			if (arr[j] < arr[h]) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			j++;
		}
		i++;
		int tmp = arr[i];
		arr[i] = arr[h];
		arr[h] = tmp;

		return i;
	}

}
