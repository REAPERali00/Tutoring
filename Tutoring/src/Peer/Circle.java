package Peer;
/**
 * has a radius, getter, setter, constrocturs, and a method 
 * to calculate the area. 
 * @author Owner
 *
 */
public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		this(0);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	} 
	
	public double area() {
		return Math.PI * Math.pow(radius, radius);
	}
}
