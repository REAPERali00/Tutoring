package Weekly;
/**
 * Have variables called height and width
 * calculate the area
 * include getter and setter to retrieve the variables
 * Use constructors. 
 */
public class Rectangle {
	//Instance varaibles 
	private double height;
	private double width;
	
	//Getter: Return the current value of the variable
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	//Setter: Change the value of the variable: 
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	//Default Constructor
	public Rectangle() {
		height = -1;
		width = 1;
	}
	//Non Default: 
	public Rectangle(double height, double width) {
		this.height = height; 
		this.width = width;
	}

	public double area() {
		return height * width; 
	}
	
	@Override
	public String toString() {
		return String.format("The rectangle with width %.2f has a height of %.2f and an area of %.2f", width, height, area());
	}
}
