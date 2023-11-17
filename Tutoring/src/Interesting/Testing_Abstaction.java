package Interesting;

abstract class A{
	private void printWorld() {
		System.out.println("Hello world");
	}
	abstract void printHello();
}

class B extends A{

	@Override
	public void printHello() {
		System.out.println("Why hello there");
		
	}
	
}

public class Testing_Abstaction {

	public static void main(String[] args) {
		A b = new B();
		b.printHello();
	}

}
