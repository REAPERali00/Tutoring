package Week3.passObjectArgument;

public class Coordinate {
	private	int x;
	private int y;
	
	public Coordinate(int a, int b)	{
		this.x=a;
		this.y=b;
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
	
	public void addCoordinate(Coordinate obj1,Coordinate obj2 )
	{
		this.x=obj1.x+obj2.x;
		this.y=obj1.y+obj2.y;		
	}
	
	public String toString() {
		String formatString = "X:%d, Y:%d";
		String description;
		description = String.format(formatString, 
				x, y);
		return description;
	}
	

}
