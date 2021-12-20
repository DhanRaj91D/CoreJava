package study.hasarelation;

public class Point {
	private int x,y;
	public Point()
	{
		x=0;
		y=0;
		
	}
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof  Point) {
			Point temp=(Point)obj;
			if(this.x==temp.x && this.y==temp.y) {
				return true;
				
			}
			else {
				return false;
			}
		}
		else
		return false;
	}
	@Override
	public String toString() {
		String str="";
		str="Point [x=" + x + ", y=" + y + "]";
		return str;
	}
}
