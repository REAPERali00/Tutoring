package Winter2023;

import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);

    public void printMenu() {
        System.out.print("1.print Hello world"
                + "\n2.print your name"
                + "\n3.exit"
                + "\nChoose one of the above: ");
    }

    public int getChoice() {
        printMenu();
        return input.nextInt();
    }

    public boolean menuExe() {
        int choice = getChoice();
        switch (choice) {
            case 1:
                System.out.println("Hello world");
                break;
            case 2:
                System.out.println("Hi " + getName());
                break;
            case 3:
                System.out.println("Bye!");
                return false;
            default:
                System.out.println("Sorry option is not implemented yet");
        }
        return true;

    }

    public void start() {
        while (menuExe())
            ;
    }

    private String getName() {
        System.out.print("Whats your name? ");
        return input.next();
    }
};
