package exeption;

public class TestFinally2 {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			throw new NullPointerException();//if we throw exception from main it will definetly crash the program
		}
		/*catch(ArithmeticException e)//if from tray exception comes then only catch get exicuted otherwise not
		 * if you write any catych block then only further code dont show error on runtime but program going to crash anyhow
		{
			System.out.println("catch");
		}*/
		
		finally
		{
			System.out.println("2");
		}
		
		//System.out.println("3");// as we throw the nullpointer excfeption the code will crash compiler know it on run time so this line will not work 

	}

}
