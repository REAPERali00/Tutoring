package Winter2023;

import java.util.Scanner;

public class Week10 {

    private Runnable run[] = { () -> friday(), () -> saturday(), () -> sunday() };

    void callDay(int i) {
        if (i < 0 || i > run.length)
            return;
        run[i].run();
    }

    void friday() {
        System.out.println("Hello world");
    }

    void saturday() {
        int age = 0, count = 12;
        if (age < 0)
            return;
        System.out.println(age);

        if (age == 1 && count > 0)
            System.out.println(count);

        switch (age) {
            case 1:
                if (count > 0)
                    System.out.println(count);
                break;

            default:
                break;
        }
        // new Menu().start();
        // For: start from a number, till a specific number. ex: 0, 1, 2, 3, 4, ..., 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a nubmer: ");
        int i = scan.nextInt();
        // While
        while (i % 2 == 0) {
            System.out.printf("Yes, %d is an even number!\n", i);
            System.out.print("Enter a nubmer: ");
            i = scan.nextInt();
        }
        // do while
        do {
            System.out.print("Enter a nubmer: ");
            i = scan.nextInt();
            if (i % 2 == 0)
                System.out.printf("Yes, %d is an even number!\n", i);
        } while (i % 2 == 0);
    }

    void sunday() {

    }

    public static void main(String[] args) {
        new Week10().callDay(1);
    }
}
