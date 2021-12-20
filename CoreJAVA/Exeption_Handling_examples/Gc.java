package exeption;

public class Gc {
	public static void main(String[] args) {
		
		//Myarr []brr=new Myarr[10000];
		
		for (int i = 0; i < 10; i++) {
			Myarr a=new Myarr();//here due to for loop the refrence of object get clered from stack aso the object get collected by gc
			System.out.println(i);
			System.gc();
		}
		
	}//end of main

}//end of Gc class

class Myarr{
	long []arr=new long[100000];
	@Override
	protected void finalize() throws Throwable {
		System.out.println("GC will collect this "+this+" ");
	}
	
}