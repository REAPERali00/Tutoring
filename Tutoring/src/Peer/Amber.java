package Peer;

import java.util.Scanner;

public class Amber {
	

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
	
	
	public static void main(String[] args) {

	}

}
