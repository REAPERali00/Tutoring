package test;

import java.util.Scanner;

public class ForLoopPractice {
	
	/**
	 * This mehtod takes a number and returns the additions up to that number 
	 * ex: 3-> 6
	 * @param n
	 * @return
	 */
	public static int additions(int n ) {
		int sum = 0;
		for(int i = 1; i <= n; i++)
			sum +=i; //remember, this is the short form of sum = sum + i
		return sum;
	}

	/**
	 * Write a program that prints the sum of all the even numbers from 1 to N,
	 * where N is a positive integer entered by the user.
	 * 
	 * @param n
	 * @return
	 */
	public static int evenNumSum(int n) {
		int sum = 0;
		for(int i =0 ; i < n; i+=2) {
			sum += i;
		}
		return sum;
	}

	public static void printFibunachi(int n) {
		int prev = 1, current = 0; // save the prev and current number
		for(int i = 0; i<n; i++) {
			current += prev; //Update the current number to the next value in fibunachi 
			prev = current - prev; //update the prev value to the value of current before the change
			System.out.printf("%d  ", current); //Print the new number 
		}
		System.out.println(); //Go to next line
	}
	
	

	public static void practiceExe(int part) {
		Scanner input = new Scanner(System.in); //create a scanner object
		if(part == 1) { //if the number given by user is 1, do this menu 
			System.out.println("Please enter the additions number: ");
			System.out.println("the addition of numbers is " + additions(input.nextInt()));
			System.out.println("Please enter the number for even sums: ");
			int even = input.nextInt();
			System.out.printf("The sum of all Even numbers till %d is %d\n", even, evenNumSum(even));
			System.out.println("Please enter the fibunachi number: ");
			printFibunachi(input.nextInt());
		}
		else {//this is the proper way of doing a menu 
			int choice = 0;
			do {
				menu();
				choice = input.nextInt();
				menuExe(choice, input);
			}while(choice != 0);
		}
		
		input.close();
	}

	public static void menu() {
		System.out.print("Please choose an option:"
				+ "\n1.Number Additions"
				+ "\n2.Even Numbers Addition"
				+ "\n3.Fibunacchi Numbers"
				+ "\n0.Exit"
				+ "\nSelect Here: ");
	}
	
	public static void menuExe(int choice, Scanner input) {
		switch(choice) {
		case 1: 
			System.out.println("Please enter the additions number: ");
			System.out.println("the addition of numbers is " + additions(input.nextInt()));
			break;
		case 2:
			System.out.println("Please enter the number for even sums: ");
			int even = input.nextInt();
			System.out.printf("The sum of all Even numbers till %d is %d\n", even, evenNumSum(even));
			
			break;
		case 3: 
			System.out.println("Please enter the fibunachi number: ");
			printFibunachi(input.nextInt());
			break;
		case 0: 
			System.out.println("Bye! ");
			break;
			default: 
				System.out.println("Sorry, this options is unavailable. please choose again.");
				break;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * Practice Time! Lets check your problem solving skills! 
		 * 1. Write a program where you take input from a user and print the addition up to that number. 
		 * 2. Write a program that prints the fibunachi nubmers till the iteration given by the user. 
		 * 3. Write a menu execution options. 
		 */
		//Here is a demonstrations: 
		practiceExe(1); 
		
	}
	
	
}
