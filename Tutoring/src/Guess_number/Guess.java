package Guess_number;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	private int ans; 
	public final static int LIMIT= 100;
	private int num_tries; 
	private Scanner scan = new Scanner(System.in); 
	
	public Guess() {
		ans = new Random().nextInt(LIMIT) + 1; 
		num_tries = 0; 
	}
	
	public boolean user_inquiry() {
		System.out.print("Guess a number: ");
		int guess = scan.nextInt();
		num_tries++;
		if(guess < 1 || guess > LIMIT) {
			System.out.println("Invalid guess. Try a number between 1 and " + LIMIT);
		} else if(guess < ans) {
			System.out.println("Try guessing a higher num");
		} else if(guess > ans) {
			System.out.println("Try guessing a lower num");
		}else {
			System.out.printf("Congrats! you got it in %d tries!\n", num_tries);
			return true;
		}
		return false; 
	}
	public void start() {
		while(!user_inquiry());
		//scan.close();
	}
}
