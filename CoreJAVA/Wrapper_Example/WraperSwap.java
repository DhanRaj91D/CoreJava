package WrapperEx;

/*--- write a swap function that will accept 2 numbers and swap their values 
Print before and after  in main 

Public static void swap( ……..  V1, …………..v2) */

public class WraperSwap {
	public static void main(String[] args) {

		// Integer x = 33;
		MyWrapper V1 = new MyWrapper();
		V1.value = 33;
		MyWrapper V2 = new MyWrapper();
		V2.value = 20;
		System.out.println(V1.value + " , " + V2.value);
		swap(V1, V2);
		System.out.println(V1.value + " , " + V2.value);
	}

	public static void swap(MyWrapper v1, MyWrapper v2) {

		int temp=0;
		temp = v1.value;
		v1.value = v2.value;
		v2.value = temp;

	}

}

class MyWrapper {
	int value;
}
