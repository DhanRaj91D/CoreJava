import java.util.Scanner;

public class MinMax {
	
	public static void main(String []args)
	{
		int []arr;
		int size;
		int choice=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of arry:");
		size= s.nextInt();
		arr = new int[size];
		
		accept_num(arr,s);
		while(true) {
		System.out.println("*******************************************");
		System.out.println("*            Operations avilable          *");
		System.out.println("*******************************************");
		System.out.println("*\n1.Display\n2.max value\n3.min value\n4.Reverse arry\n5.Even no in arry\n6.Addition of arry element\n7.Break ");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");
		choice=s.nextInt();
		System.out.println("*******************************************");
		if(choice==7)
		{
			break;
		}
		switch(choice)
		
		{
		case 1 : display(arr);
				break;
			
		case 2 : max_value(arr);
				break;
				
		case 3 :min_value(arr);
				break;
				
		case 4 : reverse(arr);
				break;
		
		case 5 : even(arr);
				break;
				
				
		case 6 : anysum(arr);
				break;
				
		case 7 : break;
		}
		
		System.out.println("");
		}
	}
	
	static void accept_num(int []arr,Scanner s)
	{
		System.out.println("Enter the value : ");
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=s.nextInt();
		}
	}
	static void display(int []arr)
	{
		System.out.println("values in arr : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " " );
			
		}
		System.out.print( " \n" );
		
	}
	
	static void max_value(int []arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			
			
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		
		}
		System.out.println("max value in arr: " + max );
		
	}
	static void min_value(int []arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			
			if(min>arr[i])
			{
				min=arr[i];
			}
			
			
		}
		System.out.println("min value in arr: " + min );
		
	}
	
	static void reverse(int []arr)
	{
		{  int i,j,temp;
		   for(i=0, j=arr.length-1; i<j ; i++, j--)
		   {                   
		        temp=arr[i];    
		        arr[i]=arr[j];
		        arr[j]=temp;
		   }
		  }
		
		System.out.println(" Reversed arry: "  );
		display(arr);
	}
	
	static void even(int []arr)
	{
		System.out.println("even numbers from arry : " );
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i])%2==0)
			{
			System.out.print(arr[i] + "  " );
			}
		}
		
	}
	
	static void anysum(int []arr)
			
	{
		int value=0;
		for(int i=0;i<arr.length;i++)
		{
			value=arr[i]+value;
		}
		
		System.out.println("addition of arry element is " +value);
		
	}
	

}
