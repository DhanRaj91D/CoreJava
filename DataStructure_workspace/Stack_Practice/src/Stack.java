
public class Stack {
	private int[] arr;
	private int top;

	public Stack() {
		arr = new int[5];
		top = -1;
	}

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void push(int value) {
		if (top < arr.length - 1) {
			top++;
			arr[top] = value;

		}

		else {
			System.out.println("Stack overflow");
		}
	}

	public int pop() {
		int value = 0;
		if (top > -1) {
			value = arr[top];
			top--;

		} else {
			System.out.println("Stack underlow ");
		}

		return value;
	}

	public String toString() {
		String str = "";

		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			for (int j = top; j >= 0; j--) {
				str = str + arr[j] + ", ";
			}
			str = str + "\n";
		}

		return str;
	}

}
