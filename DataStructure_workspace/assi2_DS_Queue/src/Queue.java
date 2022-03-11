
public class Queue {

	int[] arr;
	int F;
	int R;

	Queue() {
		arr = new int[5];
		F = R = -1;
	}

	Queue(int size) {

		arr = new int[size];
		F = R = -1;
	}

	public void insert(int value) {
		
		if (R < arr.length-1) {
			R++;
			arr[R] = value;

			if (F == -1)
				F = 0;
		}

		else
			System.out.println("Queue is full !");

	}

	public int remove() {
		int value;
		
		if (F == -1) {
			System.out.println("Queue is empty ");

		}

		if (F == R) {
			value = arr[F];
			F = R = -1;
		}

		else {
			value = arr[F];
			F++;
		}
		return value;
	}

	public void sameAs(Queue x) {
		this.F = x.F;
		this.R = x.R;

		for(int i=x.F;i!=-1 && i<=x.R;i++)
		{
			this.arr[i]=x.arr[i]; 
		}

	}

	public String toString() {
		String str = "";

		if (F == -1)
			System.out.println("Queue is empty ");
		else {
			for (int i = F; i <= R; i++) {
				str += arr[i] + ", ";
			}
		}

		return str;

	}

}
