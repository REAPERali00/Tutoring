package Weekly;

import java.util.Scanner;

public class Week9 {
	/*
	 * 0.Error: syntax, Compile, run, logical
	 * 1.Variable: primitive (value type) and reference  
	 * 		primitve types: int, double, float, char 'a', 'A', '!' , boolean, short, long, byte
	 * 2.Class: Instance variable, Constructors, getter setters, worker methods
	 * 3.Conditional statements: if else, switch, && || 
	 * 4.Loops: for, while, do while 
	 * 5.Arrays 
	 */
	public static void saturday() {
		String s = "hi how are you"; 
		String s1 =s;
		s1 = s1.toUpperCase();
		char c = '2';
		Circle circle = new Circle(12, "Ali's circle");
		Circle circle2 = circle; 
		
//		circle.setRadius(12); 
//		circle.setName("New Name"); 
		new Circle().setRadius(12); 
		System.out.println(circle.getName());
		long name; 
		char b = c; 
		
	}
	
	public static void studentExe() {
		//Declarations: 
		Student2 student;
		Scanner scan = new Scanner(System.in); 
		int id; 
		String name; 
		double gpa; 
		
		//Reading inputs: 
		System.out.print("enter the id: ");
		id = scan.nextInt();
		System.out.println("enter the name: ");
		name = scan.next();
		System.out.print("enter the gpa: ");
		gpa = scan.nextDouble();
		//Put the data into our class
		student = new Student2(id,name,gpa); 
		
		System.out.println(student);
	}
	
	public static void main(String[] args) {
		studentExe();  
	}
}
