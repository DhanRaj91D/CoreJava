import java.util.Scanner;
public class Linear {
	
	public static void main(String[] args) {
		
		int []arr=new int[] {1,5,6,7,8,9,10};
		
		int temp=5;
		
		for( int i =0;i<arr.length;i++)
		{
			if(temp==arr[i])
			{
				System.out.println("Found");
				
			}
			
			
		}
		
		binerysearch(arr);
		
		
	}
	
	public static void binerysearch(int []arr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find position  :   ");
		int key = sc.nextInt();

		int left,right,mid;
		
		left = 0;
		
		right = arr.length-1;
		
		mid = (left + right)/2;
		
		while(arr[mid] != key  && left<right)
		{
			if(key<arr[mid])
			{
				right = mid-1;
				left = 0;
			}
			else
			{
			    right = arr.length-1;
			    left = mid+1;
		     }	
			
			mid = (left+right)/2;
		}
		if(arr[mid] == key)
			System.out.println("Position  :    "+(mid+1));
		else
			System.out.println("Number not found..!!");
		
	}

}
