/*
 * 
 */
package Weekly;

public class Circle {
	//Instance variables: 
	private int radius;
	private String name;
	
	//Getters/Setter
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Constructors
	public Circle() {
		radius = 3;
	}
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	//Other: 
	public double area() {
		return Math.PI * Math.pow(radius, 2);//radius * radius 
	}
	
	@Override
	public String toString() {
		return String.format("%s has a radius of %d, and an area of %.2f", name, radius, area());
	}
	
}
