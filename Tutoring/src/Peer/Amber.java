package Peer;

import java.util.Scanner;

public class Amber {
	/*
	 * Student class, id, name, etc
	 * gpa, assign a letter to the grade. 
	 */

	public static void secondSession() {
		/**
		 * Primitive: 
		 * int 
		 * double 1.2  
		 * float
		 * char 'A' , 'b' 
		 * boolean false , true
		 */
		// Declarations: 
		int n;
		Test test = new Test(); //Instance (object) of class Test
		Test test2 = new Test();
		Scanner scan = new Scanner(System.in);
		
		
		//definition: 
		n = 10;
		test.n = 10;
		test2.n = test.n;
//		System.out.println(test2.n);
		//syso + ctrl + space 
		System.out.println("Enter number 1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + " + " + num2 + "= " + test.addNum(num1, num2));
	
	}
	
	public static void thirdSession() {
		String smt = "Hellow world\n";
		System.out.println(smt); // Prints the string and goes to the next line. 
		System.out.print(smt); // Prints the string and doesn't go to next line. 
		//System.out.printf("", smt); // Similar to printf, some differences.
		
		
		/*
		 * int in printf: %d
		 * float / double: %f
		 * string: %s 
		 * char: %c 
		 * Next line: \n
		 */
		System.out.printf("%d + %d = %d\n", 1, 2, 1+2); 
		System.out.println(1 + "+" + 2 + "= " + (1+2));
		
		//Make an Instance of test (or also called an object) 
		Test test = new Test(); //new Test() basically the constructor, it makes the object in heap. 
		Test test2 = new Test(); //new Test() basically the constructor, it makes the object in heap. 
		test.n = 2;
		
		System.out.println(new Test().devideNum(12, 0));
		
	}
	
	public static void main(String[] args) {
		 Circle circle = new Circle();
		 circle.setRad(12);
		
		 System.out.print(circle.toString());
		 System.out.println(circle.area());
	}

}
