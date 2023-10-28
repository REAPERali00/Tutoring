package Weekly;

public class Student2 {
	//Instance variable
	private int id; 
	private String name; 
	private double gpa; 
	
	//Getter and setter: 
	//Getters: 
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa; 
	}
	//Setter: 
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	//defautl Constroctur
	public Student2() {
		id = -1; 
		name = "No name"; 
		gpa = 0; 
	}
	//Non default constructor
	public Student2(int id, String name, double gpa) {
		this.id = id; 
		this.name = name; 
		this.gpa = gpa; 
	}
	
	//Woker methods: 
	public char gpaLetter() {
		if(gpa>= 90) return 'A'; 
		else if(gpa <90 && gpa >= 80) return 'B'; 
		else if (gpa < 80 && gpa >= 70) return 'C'; 
		else if (gpa < 70 && gpa >= 60) return 'D'; 
		else return 'F'; 
	}

	@Override
	public String toString() {
		return String.format("%d.%s: gpa: %.2f (%c)", id, name, gpa, gpaLetter());
	}
}
