
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
		if (top == arr.length - 1)
			System.out.println("Stack overflow");
		else {
			top++;
			arr[top] = value;
		}

	}

	public int pop() {

		int i = 0;
		if (top == -1)
			System.out.println("Stack underflow");

		else {
			i = arr[top];
			top--;
		}

		return i;

	}
	
	public void peep()
	{
		 
		if (top == -1)
			System.out.println("Stack underflow");
		
		else
		{
			System.out.println(arr[top]);
		}
	}
	
	public void PrintOdd()
	{
		if (top == -1)
			System.out.println("Stack underflow");
		
		else
		{
			for (int i = top; i >= 0; i--) {
				
				if(arr[i]%2==1)
				{
					System.out.println(arr[i]+"is odd number");
				}
				
			}
		}
		
	}
	

	public String toString() {
		String str = "";

		if (top == -1)
			System.out.println("Stack is empty");

		else {

			for (int i = top; i >= 0; i--) {
				str = str + arr[i] + ", ";
			}

		}

		return str;
	}

}
