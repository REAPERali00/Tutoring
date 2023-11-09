package Peer;

import java.util.Scanner;
/**
 *Class that contains method main. 
 * 
 * @author Owner
 */
public class Ayomide {
	/**
	 * main method, used to execute the program. 
	 * @param args arguments that can be passed on to main method, currently not used. 
	 */
	public static void main(String[]args) {
		
		Scanner scan  = new Scanner(System.in); 
		// One line only
		new Test().author("Ali");
		/*
		 * Variable types: primitive and reference 
		 */ 
		String name = "hello world  "; 
		name = name.trim(); 
		System.out.println(name.toUpperCase());
		int n = 2;
		Integer n1 = 3;
		
		int age = 11; 
		System.out.println("Please enter the age");
		age = scan.nextInt();
		if(age >12 && age < 20) {
			System.out.println("you are a teenager");
		}
		else if(age > 19) {
			System.out.println("you are a young adult");
		}
		else {
			System.out.println("You are a kid");			
		}
		
		switch(age){
		case 5: 
			System.out.println("entered 5");
			break;
		case 13: 
			System.out.println("entered 13");
			break;
		default: 
				System.out.println("Option not included. ");
		}
		
	}

}
