package Peer;

public class Test {
	public int n; //instance variable 
	private int id; 
	//Getter: returns the value
	public int getId() {
		return id;
	}
	//Setter: changes the value, ie sets it
	public void setId(int id) {
		if(id < 0) {
			System.out.println("It can't be zero!");
			return; 
		}
		this.id = id;
	}
	
	//Default Constructor: 
	public Test() {
		this(0, 4);//calling the nondefault constructor. MUST BE ON THE FIRS LINE
//		n = 0; 
//		id = -1;
	}
	//Non default Constructor. 
	public Test(int n, int id) {
		this.n = n; 
		this.id = id;
	}
	
	/**
	 * mehtod prints hello (name)
	 * @param name name that user passes on to the method 
	 */
	public void author (String name) {
		System.out.println("Hello " + name);
	}
	
	public void author() {
		System.out.println("Hello Ali");
	}
	public int devide(int n, int m) {
		return n/m;
	}
	@Override
	public String toString() {
		return String.format("The test id is %d", id);
	}

}
