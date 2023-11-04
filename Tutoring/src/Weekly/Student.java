package Weekly;

public class Student {
	public int id;
	private String name;
	private String password; 
 
	public Student() {
		this("Not Implemented", -1, "1234");
	}
	public Student(String name, int id, String password) {
		this.id = id; 
		this.name = name; 
		this.password = password; 
	}
	public String getPass() {
		return password;
	}
	public void setPass(String pass) {
		password = pass + "Security";
	}
	
	//Access Modifiers 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		System.out.println(id);
		this.id = id;
	}
	
	public void printName(String name, String msg) {
		System.out.println(msg + " " + name);
	}
	
	public int devision(int num1, int num2) {
		return num1 / num2;
	}
}
