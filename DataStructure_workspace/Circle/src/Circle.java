import java.util.Scanner;
public class Circle {

	

	public static void main(String []args)
	{
		CircleDraw [] circles;
		int noOfcircle = 0;
		Scanner c = new Scanner(System.in);
		
		System.out.println("How many circles you want to creat : ");
		noOfcircle = c.nextInt();
		circles = new CircleDraw[noOfcircle];
		populate_circle(circles ,c);
		
		for(int j = 0;j<circles.length;j++)
		{
			System.out.println(circles[j]);
		}
		
		
	}
	
	static void populate_circle(CircleDraw [] circles , Scanner c )
	{
		for(int i = 0; i< circles.length;i++)
		{
			int rad = 0;
			int x;
			int y;
			
			System.out.println("Enter the value of radius : ");
			rad = c.nextInt();
			
			System.out.println("Enter the x point : ");
			x = c.nextInt();
					
			System.out.println("Enter the y point: ");
			y = c.nextInt();
			
			circles[i] = new CircleDraw(rad,x,y);
		}
		
	}

}
