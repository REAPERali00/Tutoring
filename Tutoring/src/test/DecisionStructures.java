package test;

import java.util.Arrays;
import java.util.List;

public class DecisionStructures {
	private int year;

	private List<String> gameChoices = Arrays.asList("Paper", "Rock", "Scissor");
	
	public DecisionStructures() {
		dummyMain();
	}

	public DecisionStructures(int year) {
		this.year = year;
		isLeap();
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
	public boolean isLeap() {
//		if(year%4 == 0) {
//			if(year %100 ==0 && !(year % 400 == 0))
//				return false;
//			return true;
//		}
//		return false;

//		if (year % 4 != 0 || (year % 100 == 0 && !(year % 400 == 0))) {
//			return false;
//		}
//		return true;
		return (year % 4 != 0 || (year % 100 == 0 && !(year % 400 == 0)))? false:true;
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

	
	/**
	 * Bob is working as a bus driver. However, he has become extremely popular
	 * amongst the city's residents. With so many passengers wanting to get aboard
	 * his bus, he sometimes has to face the problem of not enough space left on the
	 * bus! He wants you to write a simple program telling him if he will be able to
	 * fit all the passengers.
	 * 
	 * @param cap: total capacity
	 * @param on: number of people on board
	 * @param wait: people waiting to get on the bus. 
	 * @return 0 if there is enough space, if not then return the number of people that can't get on the bus
	 */
	public int capacity(int cap, int on, int wait) {
		return Math.max(wait+on-cap, 0);
	}
	
	
	public void dummyMain() {
		RockPaperScissor(gameChoices.get(0));
	}
}
