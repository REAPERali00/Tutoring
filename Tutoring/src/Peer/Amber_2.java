package Peer;

import java.util.Scanner;

public class Amber_2 implements Starting{
	
	
	public void loops_explanation() {
		/*
		 * 1. for : 
		 * 		a. initialize: int i = 0; (be careful: scope is withing the loop only)
		 * 		b. condition: as long true, we continue looping.
		 * 		c. Next loop: increment i, decrement, smt.  
		 * 2. while: only has the condition for for loop
		 * 3. do while: for and while always first check the condition. do while executes first, then checks. 
		 */

		//For: 
		
		for(int i = 1 ;i < 6 ;i++) {
			if(i == 3)
			System.out.println(i);
		}
		
		//while: 
		int i = 0; 
		while(i != 5) {
			//System.out.println(i);
			i++;
		}
		// i = 5 at this point 
		
		//do while: 
		do {
			System.out.println(i);
		} while(i != 5);
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number: ");
		}while (!scan.hasNextInt() && scan.next()!= "");
		System.out.println(scan.nextInt());
	}
	
	public void leap_exe() {
		int num = 80;
		System.out.println(is_leap(num)? "yes its a leap year":"no its not a leap year. " );	
	}
	
	public void add_nums_exe() {
		System.out.println(add_nums(12));
	}
	
	public void even_exe() {
		System.out.println(even_sum(7));
	}
	
	public void start() {
		even_exe(); 
		
	}

	/**
	 * Write a Java program to determine whether a given year is a leap year or not.
	 * A leap year is a year that is divisible by 4, except for years that are
	 * divisible by 100 but not divisible by 400. Your program should prompt the
	 * user to enter a year and display whether it is a leap year or not.
	 * 
	 * Enter a year: 2024 2024 is a leap year.
	 * 
	 * Enter a year: 1900 1900 is not a leap year.
	 * 
	 * Enter a year: 2000 2000 is a leap year.
	 * 
	 * @param year
	 */
	public boolean is_leap(int year) {
		
		// TODO check if the year is divisible by 4 (which math operation should you
		// use?)
//		if(year % 4 == 0) {
//			// TODO check if the year is divisible by 100, is it also divisible by 400?
//			// == != ! < > <= >= || && 
//			if(year % 100 == 0 && year % 400 != 0)
//				return false;
//			return true;
//		}
//		return false;
		
		
		
		// TODO is there a better way to do this? what if we check negative conditions
		// instead of positive ones?
		
//		if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
//			return false; 
//		return true;
		
		return year % 4 != 0 || (year % 100 == 0 && year % 400 != 0) ? false: true;
	}

	/**
	 * write a program that takes in a nubmer, and adds up till that number. 
	 * ex: n =4, 1+2+3+4 = 10
	 * 
	 * @param n its the number that the user passes to add up till
	 */
	public long add_nums(int n) {
//		TODO write a for loop (what should the condition be? until when should we loop?)
		// TODO what should you do in the for loop? how to keep tag on the total sum?
		
		long sum = 0; 
		for(int i = 1; i <= n  ; i++) {
			sum = sum + i;
			//sum += i;
		}
		return sum;
	}

	/**
	 * Write a program that prints the sum of all the even numbers from 1 to N,
	 * where N is a positive integer entered by the user.
	 * 
	 * @param n last number to sum till
	 * @return total sum
	 */
	public int even_sum(int n) {
//		TODO write a for loop (what should the condition be ?)
		// TODO how to add up the even numbers? (hint: there are two ways)
		int sum = 0; 
		for(int i = 2; i <= n; i+=2) {
			sum = sum + i;
		}
//		for(int i =1; i <=n ; i++)
//			if(i % 2 ==0)
//				sum += i;
		return sum;
	}

}













