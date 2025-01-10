package Models;

public class Student {
	private long id; 
	private String name; 
	private double points;
	private static int counter = 1; 
	
	public long getId() {
		return id;
	}
	public Student() {
		this("N/A"); 
		points = 0;
	}
	public Student(String name) {
		this.name = name;
		id = counter; 
		counter++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPoints() {
		return points;
	}
	public void increment_points(double points) {
		this.points += points;
	}
	
	@Override
	public String toString() {
		return String.format("%d. %s (P:%.0f)",id, name, points);
	}
	
}
