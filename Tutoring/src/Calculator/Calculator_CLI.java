package Calculator;

import java.util.Scanner;

public class Calculator_CLI {

    /**
     * it takes in two numbers, and operation, and then it returns the result.
     * 
     * @param num1: is the first number
     * @param num2: is the second number
     * @param op:   the opereation. if hte operation is incorrect, the error message
     *              will be displayed.
     * @return
     */
    public static double operation(double num1, double num2, char op) {
        switch (op) {
            case '*':

                return num1 * num2;
            case '-':

                return num1 - num2;
            case '+':

                return num1 + num2;
            case '/':

                return num1 / num2;
            default:
                System.out.println("Sorry, this operation is not supported");
                return 0;
        }
    }

    /*
     * Project Goal: Create a calculator program that reads two numbers from the
     * user,
     * and asks for an operation to be done.
     * 
     */
    public static void main(String[] args) {
        // Step 1: create the variables that are going to be needed!
        Scanner input = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        char op = ' ';

        // Step 2: ask the user for the two numbers:
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();

        // Step 3: ask for the operation!
        System.out.println("Enter the operation: ");
        op = input.next().charAt(0);

        // Step 4: do the operation:
        // double result = num1 + num2;
        double result = operation(num1, num2, op);
        // Stem 5: display the results!
        System.out.println(result);
        input.close();
    }

}
