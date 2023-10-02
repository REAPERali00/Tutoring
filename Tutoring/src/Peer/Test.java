package Peer;

public class Test {
	public int n; //instance variable 
	
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

}
