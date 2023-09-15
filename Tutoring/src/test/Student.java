package test;

/**
 * Practice of the day! 
 * Create a student class, it has name, id, and a gpa! 
 * write the getters and setters 
 * Make a non-Default Constructor for it
 * take inputs from the user and put it in the student (two ways, eiter use a constroctro or use the getters and setters. for more practice, you can do both ways!) 
 * create a toString() method in the Student class that prints this information. 
 */
public class Student {
	
	private String name;
	private int id;
	private float gpa;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	public Student() {
		this("No Name", -1, -1);
	}

	public Student(String name, int id, float gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return String.format("%d. The Student name is %s, with a gpa of %.2f", id, name, gpa);
	}
}
