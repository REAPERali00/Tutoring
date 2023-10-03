package arrayListObjects;

public class Person {

	private int studentID;
	private String firstName; 
	
	public Person (int ID, String name) {
		this.studentID=ID;
		this.firstName=name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String toString() {
		String formatString = "%d, %s";
		String description;
		description = String.format(formatString, 
				studentID, firstName );
		return description;
	}
	
}
