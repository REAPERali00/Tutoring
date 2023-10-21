package Shipmenty;

public class Package {
	private double height; 
	private double width; 
	private double length;
	
	public Package() {
		this(0,0,0); 
	}
	public Package(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	} 
	
	public void displayDimentions() {
		System.out.printf("Length: %.0f height: %.0f width: %.0f\n", length, height, width);
	}
	
}
