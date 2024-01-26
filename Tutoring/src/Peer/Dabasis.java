package Peer;

import java.util.Scanner;

public class Dabasis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = 0, num2 = 0;
        System.out.println("Enter a number 1: ");
        num = scan.nextDouble();

        System.out.println("Enter a number 2: ");
        num2 = scan.nextDouble();
        System.out.println();
        double add = num + num2;
        System.out.println("the addition is :" + add);
    }
}
