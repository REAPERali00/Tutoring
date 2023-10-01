package Peer;

public class Circle {
	//Instance variables 
	private int rad;
	
	//Constructor: 
	//Default: 
	public Circle() {
		rad = 0;
	}
	
	//Non default constructor
	public Circle(int newRad) {
		rad = newRad;
	}
	
	
	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	} 
	
	public double area() {
		return Math.PI * Math.pow(rad,2);
	}
	
	@Override
	public String toString() {
		return String.format("The rad of the circle is %d and the area is %.2f\n", rad, area());
	}
}
