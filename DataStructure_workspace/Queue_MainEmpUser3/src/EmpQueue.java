
public class EmpQueue {

	Employee[] arr;
	int F;
	int R;

	public EmpQueue() {
		arr = new Employee[5];
		F = -1;
		R = -1;
	}

	public EmpQueue(int size) {
		arr = new Employee[size];
		F = -1;
		R = -1;
	}

	public void insert(Employee e) {
		if (R < arr.length - 1) {
			R++;
			arr[R] = e;
			if (F == -1)
				F = 0;
		}

		else
			System.out.println("Queue is full!");
	}

	public Employee remove() {
		Employee value;
		if (F == -1)
			System.out.println("Queue is Empty");

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

	public String toString() {
		String str = "";

		if (F == -1)
			System.out.println("Queue is empty");
		else {
			for (int i = F; i <= R; i++) {
				str = str + arr[i] + ", ";
			}
		}

		return str;

	}

}
