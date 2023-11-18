package Weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Week12 {

	public static void friday() {
		Sample samp = new Sample();
		System.out.println(samp.add_nums(4));
		if(samp.evenNumSum(-12) != -1) {
			System.out.println(samp.evenNumSum(-12));
		}
		System.out.println(samp.reverse_int(12345667));
		if(samp.is_leap(400)) {
			System.out.println("Its a leap year!");
		} else {
			System.out.println("Its not a leap year!");
		}
		System.out.printf("Its %sa leap year!\n", samp.is_leap(100)?"":"not ");
	}
	
	public static void saturday() {
		while(true) new RPS_inClass().start();
	}
	 
	public static void main(String[] args) {
		saturday();
	}
	
}

class RPS_inClass{
	
	int player_move;
	int computer_move; 
	String[] rps= {"paper", "rock", "scissor"}; 
	
	/**
	 * Compares the moves, and returns 1 if the player won, 
	 * else if the computer won return -1, if it was a tie return 0.  
	 * @param player_move
	 * @return 1: player wins, 0: tie, -1: computer wins
	 */
	public int winner() {
		//Get the player move, and the computer move and calculate the difference
		int diff = player_move - computer_move;
		if(diff == -1 || diff == 2) // if the diff is -1 or 2, the player wins
			return 1; 
		else if(diff == 0) //if the diff is 0, it means both are the same so its a tie
			return 0;
		return -1;// if the player didn't win, and its not a tie, it must be the computers win.
	}
	
	public int generate_computer_ind() {
		return new Random().nextInt(rps.length);
	}
	
	public int get_playerMove() {
		Scanner scan = new Scanner(System.in);
		int move = 0;
	
		do {
			System.out.print("Please enter your move:\n"
					+ "1.paper\n"
					+ "2.rock\n"
					+ "3.scissor\n");
			
			if(!scan.hasNextInt()) {
				System.out.println("Error, type mismatch");
				scan.next();
				continue;
			}
			move = scan.nextInt(); 
		}while(move < 1 || move > 3); 
		return move;
	}
	
	public void update_moves() {
		player_move = get_playerMove()-1;
		computer_move = generate_computer_ind();
	}
	
	public void display_choices() {
		System.out.printf("Players: %s\nComputer: %s\n", rps[player_move], rps[computer_move]);
	}
	
	public void display_winner(int winner) {
		switch(winner) {
		case 1: 
			System.out.println("The player won!");
			break; 
		case 0:
			System.out.println("Its a tie!");
			break;
		case -1:
			System.out.println("The computer won!");
			break;
		}
	}
	/**
	 * Starts the game, 
	 * @param player_move
	 */
	public void start() {
		update_moves();
		display_choices();
		display_winner(winner());
	}
}

class Sample{
	/**
	 * write a program that takes in a nubmer, and adds up till that number. ex: n =
	 * 4, 1 + 2+ 3+4 = 10
	 * 
	 * @param n its the number that the user passes to add up till
	 */
	public  int add_nums(int n) {
		// TODO write a for loop (what should the condition be? until when should we
		// loop?)
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			// TODO what should you do in the for loop? how to keep tag on the total sum?
			sum = sum + i; 
		}
		return sum;
	}
	
	/**
	 * Write a program that prints the sum of all the even numbers from 1 to N,
	 * where N is a positive integer entered by the user.
	 * ex: n = 4: 2 + 4 = 6;
	 * @param n last number to sum till, don't put negatives, won't work! 
	 * @return total sum
	 */
	public  int evenNumSum(int n) {
		if(n < 0) {
			System.out.println("Sorry, negative numbers aren't allowed here. ");
			return -1;
		}
		// TODO write a for loop (what should the condition be ?)
		int sum = 0;
		/*
		 * for(int i = 1; i <= n;i++) { // TODO how to add up the even numbers? (hint:
		 * there are two ways) if(i % 2 == 0) { sum += i; } }
		 */
		for(int i = 2; i <= n;i+=2) sum+=i;
		
		return sum;
	}
	
	/** Reverses an integer
	 * ex: num 123 returns 321
	 * @param num the passed on integer (Positive numbers only)
	 * @return returns the reversed number
	 */
	public int reverse_int(int num) {
		//TODO: Declarations: 
		int reverse = 0;
		 //TODO:Loop until number becomes zero or less
		while(num != 0)
		{
			//TODO:get the last digit from num
			//TODO:remove the last digit form num
			//TODO:update the reversed number
			reverse = reverse * 10 + num% 10;
			num /= 10;
		}
		//TODO:return the results
		return reverse;
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
		/*
		 * if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) { // TODO check if
		 * the year is divisible by 100, is it also divisible by 400? return false; }
		 * return true;
		 */
		// TODO is there a better way to do this? what if we check negative conditions
		// instead of positive ones?
		
		return !(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)); 
		
	}
}

