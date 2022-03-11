
public class CircleDraw {
	
	private int radius;
	private Point center;
	
	public CircleDraw(int rad, int x,int y) 
	{
		radius = rad;
		center = new Point(x,y);
			
	}
	public String toString() 
	{
		String str = "radius=" + radius + ", center=" + center +" ";
		
		return str;
	} 
	

}

	
	
