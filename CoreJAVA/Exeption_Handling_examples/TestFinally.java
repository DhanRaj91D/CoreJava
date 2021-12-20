package exeption;

public class TestFinally {
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			throw new NullPointerException();
			//System.out.println("2");
		}
		catch(NullPointerException e)//if from tray exception comes then only catch get exicuted otherwise not
		{
			System.out.println("3");
		}
		finally// in any condition finelly  definetly runs program in its block 
		{
			System.out.println("4");
		}
		
		System.out.println("5");//if there is no catch for exception program will crash definetly 
			
	}
	
	
	

}
