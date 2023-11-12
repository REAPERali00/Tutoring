package Practice;

import java.util.ArrayList;
import java.util.Arrays;


public class Array_practice {
	
	private ArrayList<String> gameChoices = new ArrayList<>(Arrays.asList("Paper", "Rock", "Scissor"));
	
	public void printArr(int[] arr) {
		for(int i : arr)
			System.out.println(i);
	}
	
	public void reverse(int[] arr) {
		
		int[]reverse = new int[arr.length];
		for(int i = arr.length -1, j = 0; i >=0 ; i--, j++) {
			reverse[j] = arr[i];
		}
		printArr(reverse);
	}
	/**
	 * Write a Java program to simulate a game of Rock, Paper, Scissors against the
	 * computer. The program should prompt the user to enter their choice (Rock,
	 * Paper, or Scissors), generate a random choice for the computer, and determine
	 * the winner based on the following rules:
	 * 
	 * Rock beats Scissors. Scissors beats Paper. Paper beats Rock.
	 */
	public void RockPaperScissor(String played) {
		if(!gameChoices.contains(played)) {
			System.out.println("Choice is not valid");
			return;
		}
		System.out.println("Users Choice: " + played);
		
		int cpIndex = (int) (Math.random() * 3);
		String computerPlay = gameChoices.get(cpIndex);
		System.out.println("Computers Choice: " + computerPlay);
		
		int result = cpIndex - gameChoices.indexOf(played);
		
		if(result == -1 || (result == 2)) {
			System.out.println("Winner: Computer");
		}
		else if(result == 0) {
			System.out.println("Winner: Tie");
		}
		else
			System.out.println("Winer: User");
	}

}
