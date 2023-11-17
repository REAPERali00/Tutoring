package Weekly;

import java.util.ArrayList;
import java.util.Arrays;

public class RPS {

	//Creating an array of the game options, rock paper and scissor. 
	private ArrayList<String> gameChoices = new ArrayList<>(Arrays.asList("Paper", "Rock", "Scissor"));

	/**
	 * Write a Java program to simulate a game of Rock, Paper, Scissors against the
	 * computer. The program should prompt the user to enter their choice (Rock,
	 * Paper, or Scissors), generate a random choice for the computer, and determine
	 * the winner based on the following rules:
	 * 
	 * Rock beats Scissors. Scissors beats Paper. Paper beats Rock.
	 */
	public boolean rockPaperScissor(String played) {
		//Checking if the player move is valid. (ie. its either rock, paper or scissor)
		if (!gameChoices.contains(played)) {
			System.out.println("Choice is not valid");
			return false; // print error message if the move is not valid and exit the function
		}
		
		System.out.println("Users Choice: " + played); // Display the users choice 
		//Generate a random computer move by creating an index btw 0 till 2
		int cpIndex = (int) (Math.random() * 3);
		String computerPlay = gameChoices.get(cpIndex);
		System.out.println("Computers Choice: " + computerPlay); //Display computer move
			
		//Get the difference between computer's move and the players 
		int result = cpIndex - gameChoices.indexOf(played);
		
		//Check the win condition: if the difference was -1 || 2 the computer won, 
		//if the same its  a tie and else the player won! 
		if (result == -1 || (result == 2)) {
			System.out.println("Winner: Computer");
		} else if (result == 0) {
			System.out.println("Winner: Tie");
		} else
			System.out.println("Winer: User");
		
		return true; // return true as the operation was successful. 
	}
}
