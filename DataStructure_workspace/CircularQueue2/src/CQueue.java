
public class CQueue {

	int[] arr;
	int F;
	int R;

	public CQueue() {
		arr = new int[5];
		F = R = -1;

	}

	public CQueue(int size) {
		arr = new int[size];
		F = R = -1;

	}

	public void insert(int value) {
		if ((F == 0 && R == arr.length - 1) || (R + 1 == F)) {
			System.out.println("Circular Queue is full");
		}

		else {
			if (R == arr.length - 1)
				R = 0;
			else
				R++;
			arr[R] = value;
			if (F == -1)
				F++;
		}
	}

	public int remove() {
		int value = 0;

		if (F == -1)
			System.out.println("Que is empty");
		else {
			value = arr[F];

			if (F == R)
				F = R = -1;
			else {
				if (F == arr.length - 1) {
					F = 0;
				} else
					F++;
			}
		}

		return value;
	}

	public void is_empty() {

		if (F == -1 || R == -1)
			System.out.println("Queue is empty ");

	}

	public void is_full() {

		if ((F == 0 && R == arr.length - 1) || (R + 1 == F))
			System.out.println("Queue is full ");
		else
			System.out.println("Queue is not full ");

		/*
		 * else {
		 * 
		 * if(F==0) { int i=(arr.length-1)-R;
		 * System.out.println("Queue is not full "+i+" space is empty"); } else {
		 * 
		 * } }
		 */
	}

	public CQueue buildOddNumberQueue() {

		CQueue q = new CQueue();    	 //Declare queue
		if (F == -1) {    				//check if queue is empty
			System.out.println("Queue is empty");
		} else {   						//if not take position of Front element in var i 
			int i = F;
		while (i != R) { 				// check if i which is position of front element is not same as R

				if (arr[i] % 2 != 0) 	// check if value at f is not even 
					q.insert(arr[i]); 	//insert it in q queue which we created

				if (i == arr.length - 1) // if front element is on border then make it 0
					i = 0;

				else  					// otherwise incriment its value to chek next element
					i++;
			}
		if (arr[i] % 2 != 0) 				// chek the last element and insert it in new queue
				q.insert(arr[i]);
           
		}
		return q;

	}
	

	public String toString() {
		String str = "";

		if (F == -1) {
			str = "Queue is Empty";
		}

		else {

			int i = F;

			while (i != R) {

				str = str + arr[i] + ", ";

				if (i == arr.length - 1)
					i = 0;
				else
					i++;
			}
			str = str + arr[i];

		}

		return str;
	}

}
