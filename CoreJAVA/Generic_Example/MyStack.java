package TestGeneric;

import study.hasarelation.MyDate;

class Userstack1 {
	public static void main(String[] args) {

		MyStack obj = new MyStack(new Object[5]);

		obj.push(34);  //int----autoboxing --->Integer  is a Object 
		obj.push(55);
		obj.push(new MyDate(12,12,1212));
		obj.push("lalala");
		obj.push(23);
		

		obj.display();
		//pop an element and show its square
		/*as we create stack using object so we can now send any 
		 * object to stack but while using stack in some cases it throws exception 
		 * to handle this issue 
		 * generic is itroduced in java 
		 * this ecxample is for to understand the need of generic 
		 * 
		 * 
		 */
				while(true)
				{
					try {
					int x = (Integer) obj.pop(); //downcasting, auto Unboxing
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

public class MyStack {

	private Object[] arr;
	int topIndex = -1;

	public MyStack(Object[] ar) {
		arr = ar;
	}

	public void push(Object obj) {
		int temp = ++topIndex;
		if (temp < arr.length)
			arr[temp] = obj;
		else {
			System.out.println("stack full");
		}
		// throw new StackFullException();
	}

	public Object pop() {
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
