package Peer;

public class Circle {
	//Instance variable: 
	private int rad;
	
	//Default Costructor
	public Circle() {
		rad = -1;
	}
	//Non default: 
	public Circle(int newRad) {
		rad = newRad;
	}
	
	//Getter: return the value of rad
	public int getRad() {
		return rad;
	}
	
	//Setter: changes the value of rad
	public void setRad(int newRad) {
		rad = newRad;
	}
	
	
	public double area() {
		return Math.PI * Math.pow(rad, 2);  
	}
	
}
