
public class Main {
	
	public static void main(String [] args)
	
	{
		
		 CQueue q1=new CQueue();
		// CQueue q2=new CQueue();
		
		 
			q1.insert(10);                              
			q1.insert(23);
			
			q1.insert(5);
			q1.insert(10);
			q1.insert(11);     

			q1.is_empty();
			q1.is_full();
			
		q1=q1.buildOddNumberQueue();
		System.out.println(q1);
		System.out.println(q1);
		
	}

}
