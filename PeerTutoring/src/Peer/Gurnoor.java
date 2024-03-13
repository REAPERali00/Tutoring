package Peer;

import java.util.Scanner;

public class Gurnoor {

    private static Scanner scan = new Scanner(System.in);

    private static class Example {
        private int num;
        private String name;

        // Constructors
        public Example() {
            this(1, "Default Constructor");
            // num = 12;
            // name = "Default name";
        }

        public Example(int num) {
            this(num, "non default constructor with only num");
        }

        public Example(int num, String name) {
            this.name = name;
            this.num = num;
        }

        // Getters/setters
        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int addition(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }

        public void printAddition(int num1, int num2) {
            System.out.println("The result of the addition is " + addition(num1, num2));
        }

        public String toString() {
            return String.format("%s, you are number %d", name, num);
        }
    }

    void classExample() {
        int num = 4, num2 = 8;
        Example ex = new Example(1, "Ali");
        Example ex2 = new Example(45);
        ex2.setName("Ali");
        ex2.setNum(12);

        System.out.println(ex2);
        System.out.println(ex.num);
        ex.printAddition(num, num2);
        ex.addition(num, num2);

        ex.printAddition(1, num2);

    }

    void printMenu() {
        System.out.print("choose one of the following: " +
                "\n1. print hello world"
                + "\n2. print user name"
                + "\n3.Exit"
                + "\nEnter here: ");
    }

    int getChoice() {
        printMenu();
        int choice = 0;
        return scan.nextInt();
    }

    void displayUserName() {
        System.out.print("whats your name? ");
        System.out.println("Hello " + scan.next());
    }

    void exeMenu(int choice) {
        final int printName = 2, printHello = 1;
        switch (choice) {
            case printHello:
                System.out.println("hello world");
                break;
            case printName:
                displayUserName();
                break;
            default:
                System.out.println("this option is not implemented yet.");
                break;
        }
    }

    void switchPractice() {
        // if else

        // switch
        int age = 13;

        if (age >= 13 && age <= 19) {
            System.out.println("you are a teenager");
        }

        switch (age) {
            case 13:
                System.out.println("you are 13");
                break;
            case 14:
                System.out.println("you are 14");
                break;
            default:
                System.out.println("you are not 13 or 14 ");
        }

        int choice = getChoice();
        if (choice != 3) {
            exeMenu(choice);
            switchPractice();
        }
    }

    /**
     * Conditional statements: if else, booleans, logical opersations
     * Loops: for, while, do while loop
     * array: bunch
     */
    public static void main(String[] args) {
        new Gurnoor().switchPractice();
    }
}
