 package exeption;

public class TestCommandLine {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]+",");
			System.out.println("Uppercase : "+args[0].toUpperCase());
			
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("no 1 catch "+e);
		}
		
		try {
			
			int x=Integer.parseInt(args[1]);
			System.out.println("Square= "+x*x);
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("no 2 catch "+e);
		}
		
		catch (Exception e) {
			
			System.out.println("Exception catch " +e);
			
		}
		
	}

}
