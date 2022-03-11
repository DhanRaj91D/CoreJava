package stackVowels;

public class stack {

	char[] arr;
	int top;

	public stack() {
		top = -1;
		arr = new char[5];

	}

	public stack(int size) {
		top = -1;
		arr = new char[size];
	}

	public void push(char value) {
		if (top < arr.length - 1) {
			top++;
			arr[top] = value;
		}

		else
			System.out.println("Stack overflow");

	}

	public char pop() {
		char value = 0 ;

		if (top > -1) {
			value = arr[top];
			top--;
		}

		else

			System.out.println("Stack Underflow");

		return value;
	}
	
	public void chekvowel()
	{		int count ='0';
			char []brr = new char[5] ;
			
		for (int j = top; j >= 0; j--) 
		{
			if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' || arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U')
			count++;
			
			brr[j]=arr[j];
		}
		
		for(int i=0;i<brr.length;i++)
		System.out.println(brr[i]);
	}

	public String toString() {
		String str = "";

		if (top == -1) {
			str = "Stack is Empty";

		} else {
			for (int j = top; j >= 0; j--) {
				str = str + arr[j] + ",";

			}
			str = str + "\n";
		}
		return str;
	}

}
