package Student;

public class Student {
	private int id; 
	private String name; 
	private float gpa; 
	
	public int getId() {
		return id; 
	}
	public void setId(int id) {
		this.id = id; 
	}
	
	public Student() {
		id = 2; 
		name = "No name"; 
		gpa = 80; 
	}
	public Student(int id, String name, float gpa) {
		this.id = id; 
		this.name = name; 
		this.gpa = gpa; 
	}
	
	
	public char getGPALetter() {
		if(gpa >= 90)
			return 'A'; 
		else if(gpa < 90 && gpa >= 80)
			return 'B'; 
		else if(gpa < 80 && gpa >= 70)
			return 'C'; 
		else 
			return 'F'; 
	}
	
	@Override
	public String toString() {
		return String.format("%d.%s has a gpa of %.2f and recieved an %c", id, name, gpa, getGPALetter());
	}
	
}
