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
		this.id = id;
	}
	
	//Default Constructor: 
	public Test() {
		this(0, -1);//calling the nondefault constructor. MUST BE ON THE FIRS LINE
//		n = 0; 
//		id = -1;
	}
	//Non default Constructor. 
	public Test(int n, int id) {
		this.n = n; 
		this.id = id;
	}
	
	//method 
	public void author (String name) {
		System.out.println("the author is " + name);
	}
	
	public int addNum(int n, int m) {
		return n + m; 
	}
	
	public int devideNum(int n, int m) {
		return n /m;
	}
	
	public void printHelloWorld() {
		System.out.println("Hello world");
		author("Ali");
	}
	
	public int remainder (int num1, int num2) {
		return num1 % num2; //Modula
	}
	
	@Override
	public String toString() {
		return String.format("The test id is %d", id);
	}

}
