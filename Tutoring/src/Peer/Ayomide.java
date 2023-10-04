//package Peer;
//
//import java.util.Scanner;
//
//public class Ayomide {
//	/**
//	 *	Topics: 
//	 * 1. Variales: Primitive, Reference type
//	 * 2. Methods: code that is written somewhere else, and has a name, return type, parameter. 
//	 * 3. Class: Code that is in another file, and we use it in our current file. 
//	 * 	class has: instance variable, methods, constructors, getter/setter.  
//	 */
//	public static void main(String[] args) {
//		//Variables: Type, name (Declaration)
//		/*
//		 * Primitive types: 
//		 * int: 0, -1, 2, 4 
//		 * double : 1.23, 1.2344444444444444444444443
//		 * float: 1.23, 5.0
//		 * char: 'A', 'a', '3', '*', ' ' 
//		 * boolean: true, false
//		 */
//		
//		int num = 5;
//		double val = num * 1.0 / 2;
//		char c = 'A' + 25; //a Asci table. 
//		
//		//System.out.println(c);
//		
//		//Reference type: 
//		Circle smt = new Circle();//Makes an object/ Instance of Circle.
//		Scanner input = new Scanner(System.in);
//		//smt.rad = 2;
//		System.out.println("Enter the rad: "); //Prompt 
//		int rad = input.nextInt();
//		smt.setRad(rad);
//		
//		double result = smt.area();
//		System.out.println("The radius of the circle is " + smt.getRad());
//		System.out.println("The area is : " + result);
//		
//		/* Pseudo code for printing age: 
//		 * Start 
//		 *  Declaration: 
//		 *  	num age
//		 *  output "Enter your age" 
//		 *  input age 
//		 *  output "You are " + age + " Years old" 
//		 * Stop
//		 * 
//		 * void printHello()
//		 * 	output "Hello "
//		 * return
//		 * 
//		 * 
//		 */
//		input.close();
//	}
//
//}
