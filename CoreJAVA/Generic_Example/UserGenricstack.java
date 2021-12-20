package TestGeneric;

public class UserGenricstack {
	public static void main(String[] args) {
		MyGenericStack<Integer> stack = new MyGenericStack<>(new Integer[5]);
		
		stack.push(34);  //int----autoboxing --->Integer  is a Object 
		stack.push(55);
		//stack.push(new MyDate(12,12,1212));
		//stack.push("lalala");
		
		/*
		 * As we make stack class genric we can now decide the stack contain 
		 * which type of object only so error get cleared
		 */
		stack.push(23);
		stack.push(66);
		stack.push(88);
		
		//pop an element and show its square
		while(true)
		{
			try {
			int x = stack.pop();
			System.out.println(x*x);
			}
			catch(NullPointerException npe)
			{
				System.out.println("stack empty");
				break;
			}
		}
	}

}

class MyGenericStack<T> {

	private T[] arr;
	int topIndex = -1;

	public MyGenericStack(T[] ar) {
		arr = ar;
	}

	public void push(T obj) {
		int temp = ++topIndex;
		if (temp < arr.length)
			arr[temp] = obj;
		else {
			System.out.println("stack full");
		}
		// throw new StackFullException();
	}

	public T pop() {
		int temp = topIndex;
		if (temp >= 0) {
			return arr[topIndex--];
		} else
			return null;
	}

	public void display() {
		for (int i = 0; i <= topIndex; i++) {
			System.out.println(arr[i]);
		}
	}
}

