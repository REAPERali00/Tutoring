package Peer;

import java.util.Scanner;

public class Yining {

	/*
	 * Variables : additions, modula, division: += ++ -- 
	 * Classes: Methods (ex: print hello world, method that prints name , does addtion), getter and setter, 
	 * Constructors
	 * Conditional statements: booleans, <, > , <=, ==, !=, !, &&, || 
	 * if else elseif, switch 
	 * 
	 * 
	 * 
	 */
	public static void firstSession() {
		int n ; 
		Test2 test = new Test2();
		Test2 test2 = new Test2();
		test2.n = 2; 
		if(test2.n > 3) {
			System.out.println("The number is bigger then 3");
		}
		else {
			System.out.println("THe number is smaller then 3");
		}
		System.out.println(test2.add(12));//syso + ctrl + space 
	}
	
	public static void main(String[] args) {
		Test test= new Test(1,2);
		Scanner scan = new Scanner(System.in); 
		double weight;
//		System.out.println("Enter the weight");
		int n = 1212312312;
		int m = 1212312312;
		System.out.println(n + m);
		System.out.println(test.devide(1, 0));
		n = 12;
		weight = scan.nextDouble();
	
		
		
	}
	

}
