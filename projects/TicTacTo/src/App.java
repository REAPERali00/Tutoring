import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);

    public void tic(int i) {
        if (i == 0) {
            TicTacToe tic = new TicTacToe();
            tic.dumbyMain(scan);
        } else {
            new TicGUI().start();
        }

    }

    public static void main(String[] args) throws Exception {
        new App().tic(1);
    }
}
