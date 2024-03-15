

import java.util.Random;
import java.util.Scanner;

public class HangMan {
	private String words[]= {"balls", "deck", "duck", "sock", "kiss", "shot", "six", "batch"}; 
	private String secret_word;
	private String guess_display;
	private Scanner scan;
	
	private int wrong_guesses;
	char[] man_final = {'O', 'I', '/', '\\' , '/', '\\'};
	char[][] hangman_drawing = { 
			{ ' ', ' ', ' ', '+', '-', '-', '-', '+', ' ', ' ' },
			{ ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ' }, 
			{ ' ', ' ', ' ', 'O', ' ', ' ', ' ', '|', ' ', ' ' },
			{ ' ', ' ', '/', 'I', '\\', ' ', ' ', '|', ' ', ' ' },
			{ ' ', ' ', '/', ' ', '\\', ' ', ' ', '|', ' ', ' ' }, 
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ', ' ' },
			{ '=', '=', '=', '=', '=', '=', '=', '=', '=', '=' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
	
		
 	public HangMan() {
		secret_word  = get_word();
		scan = new Scanner(System.in);
		guess_display = "_ ".repeat(secret_word.length()) ;
	}
	
 	private String get_word() {
 		return words[new Random().nextInt(words.length)];
 	}
 	
	private void print_man() {
		for (int i = 0; i < hangman_drawing.length; i++) {
            for (int j = 0; j < hangman_drawing[i].length; j++) {
                System.out.print(can_print(i, j) ? hangman_drawing[i][j] : ' ');
            }
            System.out.println();
        }

	}
	
	public boolean is_man(char ch) {
		for(char part : man_final) {
			if(ch == part)
				return true;
		}
		return false;
	}
	
	// Method to check if a part of the man should be printed
    private boolean can_print(int row, int col) {
        char part = hangman_drawing[row][col];
        
        if(!is_man(part)) return true;
        // Map the hangman parts to the wrong guesses
        int partIndex = switch (part) {
            case 'O' -> 0;  // Head
            case 'I' -> 1;  // Body
            case '/' -> (row == 3) ? 2 : 4; // Right arm and right leg
            case '\\' -> (row == 3) ? 3 : 5; // Left arm and left leg
            default -> -1;
        };
        
        // Only print the part if the number of wrong guesses is greater than the part index
        return partIndex != -1 && wrong_guesses > partIndex;
    }

	private char get_playerMove() {
		String play = "";
		System.out.print("Guess a Letter: ");
		play = scan.next();
		
		while (!play.matches("[a-zA-Z]") || play.length() > 1) {
            System.out.println("Invalid input. Please enter a single letter: ");
            play = scan.next();
        }
		return play.charAt(0);
	}
	
	private boolean has_won() {
		return secret_word.equalsIgnoreCase(guess_display.replaceAll("\\s+", ""));
	}
	
	private boolean has_lost() {
		return wrong_guesses >= 6;
	}
	
	private void set_player_move(char play) {
		boolean found = false;
		StringBuilder sb = new StringBuilder(guess_display);
		for(int i = 0; i < secret_word.length(); i++) {
			if(secret_word.charAt(i) == play) {
				found = true;
				sb.setCharAt(i*2, play);
			}
		}
		if(!found) wrong_guesses++;
		guess_display = sb.toString();
	}
	
	public void play() {
		print_platform();
		set_player_move(get_playerMove());
	}
	
	public String get_display() {
		return String.format("%s\n", guess_display);
	}
	
	public void print_platform() {
		print_man();
		System.out.println(get_display());
	}
	
	public void start() {
		while(!has_won() && !has_lost()) play();
		print_platform();
		if(has_won())
			System.out.println("Congrats! you won! the word was: " + secret_word);
		else
			System.out.println("You lost!");
	}
}
