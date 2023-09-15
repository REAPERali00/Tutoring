package TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	
	private char[][] gameBoard = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'},
			{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
	private char[] player = {'X', 'O'};
	private int turn;
	private int counter;
	

	public TicTacToe() {
		counter = 0;
		turn = 0;
	}
	
	public void printBoard() {
		for(char[] row : gameBoard) {
			for(char c: row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	
	public void playerMove(int position) {
		
		if (position > 9 || position < 1) {
			System.out.println("Position entered is out of bounds");
			return;
		}
		int y = (position-1) %3 * 2, x = ((position-1) /3) * 2;
		if (gameBoard[x][y] == player[0] || gameBoard[x][y] == player[1]) {
			System.out.println("The current position on board already has been filled, please choose another option");
			return;
		}
		gameBoard[x][y] = player[turn++];
		turn %= 2;
		counter++;
	}
	
	public boolean checkTie() {
		return counter < 10;
	}
	

	public boolean checkWin() {
		
		for(int i = 0; i < gameBoard.length; i+=2) {
			if(gameBoard[i][0] != ' ' && gameBoard[i][0] == gameBoard[i][2] && gameBoard[i][2] == gameBoard[i][4])
				return true;
			if(gameBoard[0][i] != ' ' && gameBoard[0][i] == gameBoard[2][i] && gameBoard[2][i] == gameBoard[4][i])
				return true;
		}
		if(gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][4])
			return true;
		if(gameBoard[0][2] != ' ' && gameBoard[0][2] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][0])
			return true;
		return false;
	}
	
	public void dumbyMain(Scanner scan) {
		
		do {
			try {
				System.out.println("Please enter the position (1-9):");
				playerMove(scan.nextInt());
				printBoard();
				
				
			}catch(InputMismatchException e) {
				System.out.println("sorry, please enter an integer.");
				scan.next();
			}
			
		}while(!checkWin());
		System.out.println("Congrats! you won!");
	}
}
