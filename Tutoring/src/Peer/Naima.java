package Peer;

import java.util.Scanner;

public class Naima {
/**
 * 
 * Topics: 
 * 0. Error types: Sysntax, Compile time, Run time, Logical 
 * 1. Variables: primitive and reference 
 * 2. Methods : code that is written somewhere else, and has a name.A method has a return type and a parameter. 
 * 3. Class, how to use code that is written in a different file. l
 * 4. Class detail: instance variables, getter and setter (access modifiers) , 
 * 		Constructors, other methods inside class. 
 * 
 * 5. Conditional statements
 * 6. loops
 * 7. array 
 */
	
	public static void firstSession() {
		//Declaration: type + name. 
		int m = 2;
		int n;
		// Definining it: 
		n = 3;
		/*
		 * Primitive: 
		 * 1. int: 0, 1, 2, 3
		 * 2. double: 2.3, 3.4, 2.333333333333333333333333333
		 * 3. float: 2.3 , 2.3333
		 * 4. char : 'A', 'B' , '3' 
		 * 5. boolean: true, false 
		 */
		double newvar = 5 / 2;
		
		//Short cut: syso + ctrl + space
		//System.out.println(newvar);
		
		char smt = 65;
		int smt2 = 'B';
		
		//System.out.println(smt + " " + smt2);
		 
		//Reference types: 
		Test smtToUse = new Test(); // Building, known as instance of Test or object. 
		//smtToUse.printHelloWorld();
		n = 3; 
		m = 0;
		//System.out.println(smtToUse.devideNum(n, m));
		
		Test smtUse2 = new Test();
		
		smtToUse.n = 2;
		//smtUse2.n = smtToUse.n;
		
		System.out.println(smtUse2.n);
//		System.out.println(new Test().n);
//		new Test().n = 3;
//		System.out.println(new Test().n);
	}

	public static void secondSession() {
		Scanner scan = new Scanner(System.in);
		int age = 0; 
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		System.out.println("you are " + age + " years old.");
		
		System.out.println("Enter your name: ");
		String name = scan.next();
		System.out.printf("Hello %s", name);
		scan.close();
	}

	public static void main(String[] args) {
		secondSession();
	}

}
