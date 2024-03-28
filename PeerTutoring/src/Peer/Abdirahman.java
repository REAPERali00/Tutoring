package Peer;

public class Abdirahman {
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

    void start() {
        testAge();
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

    public static void main(String[] args) {
        new Abdirahman().start();
    }
}
