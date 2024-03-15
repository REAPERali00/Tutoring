
import java.util.Random;
import java.util.Scanner;

/*
 * int random number
 * scannr 
 * if else to check if the nubmer is lower, higher, or same. 
 * count tries 
 * loop untill we get the correct answer. 
 */
public class Guessing_Game {
	/**
	 * randome number: 
	 */
	private int random_num; 
	private final static int LIMIT = 100; 
	private Scanner scan;
	private int count; 	
	/**
	 * create random number and scanner. 
	 */
	public Guessing_Game() {
		//Generating the random integer between 1 and 100(limit)
		random_num = new Random().nextInt(LIMIT) + 1;
		scan = new Scanner(System.in); 
		count = 0;
	}
	
	/**
	 * Method asks the user for the iput, and compares with the random number. 
	 * @return return true if guessed correctly, else print related messsage and return false. 
	 */
	private boolean guess_user() {
		System.out.print("Guess a number: ");
		int guess= scan.nextInt();
		count++;
		if(guess > random_num) {
			System.out.println("Guess lower.");
		}else if(guess < random_num) {
			System.out.println("Guess Higher");
		} else {
			System.out.printf("You guessed it! you guessed in in %d tries! \n", count);
			return true; 
		}
		
		return false;
	}
	
	/**
	 * Mehtod jump starts the game, loops until the user guesses the nubmer correctly. 
	 * WARNING: call once only per each object. 
	 */
	public void start() {
		//Loop until the user guesses the nubmer, which returns true. 
		while(!guess_user());
		scan.close();
	}
	
}
