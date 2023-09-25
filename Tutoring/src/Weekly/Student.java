package Weekly;

public class Student {
	private int id;
	private String name;
	private String password; 
	
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
}
