
import java.util.Random;
import java.util.Scanner;

public class RPS {

    int player_move;
    int computer_move;
    String[] rps = { "paper", "rock", "scissor" };

    /**
     * Compares the moves, and returns 1 if the player won,
     * else if the computer won return -1, if it was a tie return 0.
     * 
     * @param player_move
     * @return 1: player wins, 0: tie, -1: computer wins
     */
    public int winner() {
        // Get the player move, and the computer move and calculate the difference
        int diff = player_move - computer_move;
        if (diff == -1 || diff == 2) // if the diff is -1 or 2, the player wins
            return 1;
        else if (diff == 0) // if the diff is 0, it means both are the same so its a tie
            return 0;
        return -1;// if the player didn't win, and its not a tie, it must be the computers win.
    }

    public int generate_computer_ind() {
        return new Random().nextInt(rps.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public int get_playerMove() {
        System.out.print("Please enter your move:\n"
                + "1. paper\n"
                + "2. rock\n"
                + "3. scissor\n");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Try again. Enter 1, 2, or 3:");
                scanner.next(); // clear the invalid input
                continue;
            }
            int move = scanner.nextInt();
            if (move >= 1 && move <= 3) {
                return move;
            }
            System.out.println("Invalid choice. Enter 1, 2, or 3:");
        }
    }

    public void update_moves() {
        player_move = get_playerMove() - 1;
        computer_move = generate_computer_ind();
    }

    public void display_choices() {
        System.out.printf("Players: %s\nComputer: %s\n", rps[player_move], rps[computer_move]);
    }

    public void display_winner(int winner) {
        switch (winner) {
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

    public void game() {
        while (true)
            start();
    }

    /**
     * Starts the game,
     * 
     * @param player_move
     */
    public void start() {
        update_moves();
        display_choices();
        display_winner(winner());
    }
}
