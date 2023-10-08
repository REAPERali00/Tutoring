package Weekly;

import java.util.Scanner;

public class Week4 {
	
	public static void friday() {

		/**
		 * Primitive: 
		 * int -1 , 9 ..
		 * double: 12.4  
		 * float:  1.4 
		 * char: 'A', '3', '!' 
		 * boolean: true, false 
		 */
		//Declaration and definition: 
		int n = 5;
		//Declaration: type + name: int + num 
		double d = n * 1.0 / 2;
		char c = 97;//Asci table 
		int c2 = 'a';
		//n =(int) d;
		//System.out.println(c);//syso + ctrl + space

		//References: 
		Circle circle = new Circle(12, "Circle"); 
		//		circle.setRadius(12);
		System.out.println(circle);
		Circle circle2 = new Circle(3, "Round");
		System.out.println(circle2 + "\nGood bye!");
		/*
		 * int: %d
		 * double and float: %f
		 * string %s
		 * char %c
		 */
		//		System.out.printf("The radius is: %d \n", circle.getRadius()); 

	}
	
	public static void main(String[] args) {
		sunday();
	}

	/**
	 * Rectangle: height + width 
	 * whats the area? 
	 * 
	 */
	public static void saturday() {
		//Refernce Types: 
		Scanner input = new Scanner(System.in);
		Rectangle rec ;//Instance of class Rectangle. Object
		int height = 0, width = 0; 
		
		
		 System.out.print("Please enter the height: "); 
		 height = input.nextInt();
		 System.out.print("Please enter the width: "); 
		 width = input.nextInt();
		 	
		rec = new Rectangle(height, width);
		
		/*
		 * System.out.println(rec.getHeight());
		 * 
		 * rec.setHeight(height); rec.setWidth(width);
		 */
		
//		System.out.println("Width: " + width + " Height: " + height);
		/*
		 * int: %d
		 * float/double: %f
		 * String: %s
		 * char: %c
		 * 
		 */
		System.out.println(rec);
		
		Circle circle;
//		Scanner input = new Scanner(System.in);
		int radius; 
		String name; 
		
		System.out.println("Enter the radius: ");
		radius = input.nextInt();
		System.out.println("Enter the name: ");
		name = input.next();
		
		circle = new Circle(radius, name);
		
		System.out.println(circle);
		
	}
	
	/**
	 * 0. Error types: Syntax, Logical, Compile time, run time 
	 * 1. variables: primitive, reference. 
	 * 2. methods: variables for code, code written and given a name. two: return type, parameter. 
	 * 3. Class: code that is in another file
	 * 4. Class details: setters and getters, constructors, worker methods. 
	 * 
	 * 5. Conditional statements
	 * 6. loops
	 * 7. arrays 
	 *  
	 */
	public static void sunday() {
		
		/*
		 * Primtive: 
		 * int: 0, 1, -1, 5
		 * double: 1.2, 12.12312312312312312
		 * float: 45.654, 12. 123123
		 * char: 'a', 'A', '1', '!' 
		 * boolean: true and false
		 */
		//Declaration: type + name, Naming convention: 12num X, Num X, no special char: ! %, _ is ok. 
		int num = 5;
		double d = num * 1.0 /2;
		char c = 'A'+ 5; // Asci table 
		//See something in console: print statements
		//System.out.println(c);
		
		//Reference types: mainly for classes and objects
		Test smt = new Test(); // Instance of class Test, also known as object
		//smt.printHello("ALi");
		; // 7;
		System.out.println(smt.addition(num, 2));
	}

}
