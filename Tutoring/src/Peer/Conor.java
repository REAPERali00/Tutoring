package Peer;

import java.util.InputMismatchException;

interface D{
	double PI = 3.14;
	String IP = "127.0.0.1";
	void printHello();
}
final class E{
	
}
abstract class A{
	public A() {
		System.out.println("A");		
	}
	public A(int x) {
		System.out.println("A" + x);
	}
	public void printName(String name) {
		System.out.println(name);
	}
	
	abstract int add(int n , int m);
}
 	
class B extends A implements D{
	
	public B() {
		this(4);
		System.out.println("B");
	}
	
	public B(int x) {
		super(x);
		System.out.println(x);
	}
	@Override
	int add(int n, int m) throws ArithmeticException {
		return n/m;
	}

	@Override
	public void printHello() {
		System.out.println("Hello world");
		
	}
	
}
class C extends A{
	@Override
	int add(int n, int m) {
		if(m == 0) {
			System.out.println("Cant devide by 0");
			return 0; 
		}
		return n/m;
	}
}

public class Conor {
	
	private static Connor2 con = new Connor2();
	
	public static void main(String[] args) {
		A a[] = {new B(), new C()};
		D d = new B();
		for(A val : a) {
			try {
				System.out.println(val.add(2, 0));				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
//		B b = new B();
			
	}
}

