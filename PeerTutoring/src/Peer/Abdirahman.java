package Peer;

import java.util.Scanner;

public class Abdirahman {

    private static Scanner scan = new Scanner(System.in);

    void start() {
        driver();
    }

    private static class Student {
        public double gpa;
    }

    char grade(double grade) {
        char[] letters = { 'A', 'B', 'C', 'D', 'F' };
        int[] grades = { 80, 70, 60, 50, 40 };
        for (int i = 0; i < letters.length; i++) {
            if (grade < grades[i]) {
                continue;
            }
            return letters[i];
        }
        return 'F';
    }

    void division(int n) {
        if (n != 0)
            System.out.println(12 / n);
        else {
            System.out.println("no 0's ");
        }
    }

    /**
     * Testing the check age method
     * practice arrays and for loops
     */
    void testAge() {
        int[] numbers = { -1, 0, -123, 200, 1, 12, 13, 15, 19, 20, 199 };
        String[] result = { "Invalid Age", "Invalid Age", "Invalid Age", "Invalid Age", "kid", "kid", "teen", "teen",
                "teen", "adult", "adult" };
        for (int i = 0; i < numbers.length; i++) {
            String res = checkAge(numbers[i]);

            if (result[i].equals(res)) {
                System.out.printf("%d: actual:%s expected:%s passes\n", numbers[i], res, result[i]);
            } else {
                System.out.printf("%d: actual:%s expected:%s did not pass\n", numbers[i], res, result[i]);
            }
        }
    }

    /*
     * checking age limit, a practice using if statements
     */
    String checkAge(int age) {
        if (age < 13 && age > 0) {
            return "kid";
        } else if (age < 20 && age > 12) {
            return "teen";
        } else if (age < 200 && age > 19) {
            return "adult";
        } else {
            return "Invalid Age";
        }

    }

    private static class FishNet {
        private int largeFishCount;
        private int mediumFishCount;
        public final static double LARGE_FISH_COST = 42.5;
        public final static double MEDIUM_FISH_COST = 15.50;

        public FishNet() {
            largeFishCount = 2;
            mediumFishCount = 5;
        }

        public FishNet(int largeFishCount, int mediumFishCount) {
            this.largeFishCount = largeFishCount;
            this.mediumFishCount = mediumFishCount;
        }

        public int getLargeFishCount() {
            return largeFishCount;
        }

        public void setLargeFishCount(int largeFishCount) {
            this.largeFishCount = largeFishCount;
        }

        public int getMediumFishCount() {
            return mediumFishCount;
        }

        public void setMediumFishCount(int mediumFishCount) {
            this.mediumFishCount = mediumFishCount;
        }

        public double calculateValue() {
            return LARGE_FISH_COST * largeFishCount + MEDIUM_FISH_COST * mediumFishCount;
        }

        public String toString() {
            return String.format("The total value of the catch is $%.2f",
                    calculateValue());
        }
    }

    private FishNet getFishFromUser() {
        int large = 0, medium = 0;
        String choice = "";
        do {
            System.out.print("Ente fish size (1.large 2.medium): ");
            int userInput = scan.nextInt();
            if (userInput == 1)
                large++;
            else if (userInput == 2)
                medium++;
            else
                System.out.println("Option not available");
            System.out.print("continue? (y/n)");
            choice = scan.next();
        } while (!choice.equalsIgnoreCase("n"));

        return new FishNet(large, medium);
    }

    void driver() {
        System.out.println(getFishFromUser());

    }

    public static void main(String[] args) {
        new Abdirahman().start();
        scan.close();
    }
}
