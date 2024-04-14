package Winter2023;

import java.util.Scanner;

public class Week14 {
    private Runnable run[] = { () -> friday(), () -> saturday(), () -> sunday() };

    void callDay(int i) {
        if (i < 0 || i > run.length)
            return;
        run[i].run();
    }

    void friday() {

    }

    void saturday() {

    }

    int div(int n, int m) {
        return n / m;
    }

    void sunday() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a nubmer: ");
        int num = scan.nextInt();
        System.out.println("your number was " + num);
        System.out.println(div(-8, 0));

    }

    public static void main(String[] args) {
        new Week14().callDay(2);
    }
}
