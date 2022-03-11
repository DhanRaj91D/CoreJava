
public class Mathutil {
	
	int i;
	
	
	
	public Mathutil(int i) {

		this.i = i;
	}

	public static int getSquare(int a)
	{
		int b=a*a;
		
		return b;
	}

	public static int getFactorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact= fact *i;
			
		}
		
		return fact;
	}
	
	//Display first n prime numbers. take input n from user
	public static void First_N_Prime(int n)
	{
		
		int i=1;
		int k=0;
		while(true)
		{
			int count =0;
			i++;
			for(int j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
					count++;
				}
			}
				
			if(count==2)
				{
					k++;
					System.out.print(i+", ");
					
				}
			
				if(k==n)
					break;
				
		}
		
	}
	public static void isPrime(int a)
	{
		int count = 0;
		for(int i = 2; i<a; i++)
        {
            if(a%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print(+a+ " is a Prime Number");
        }
        else
        {
            System.out.print(+a+" is not a Prime Number");
        }
		
	}
	
	 
	
}
