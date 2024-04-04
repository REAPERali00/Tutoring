package Winter2023;

import java.util.Scanner;

public class Week12 {
    private Runnable run[] = { () -> friday(), () -> saturday(), () -> sunday() };

    void callDay(int i) {
        if (i < 0 || i > run.length)
            return;
        run[i].run();
    }

    void friday() {

    }

    void saturday() {
        Scanner scan = new Scanner(System.in);
        int high = 0, low = 0;
        int choice = 0;
        do {
            System.out.print("add high quality or low quality? (1 or 2)");
            choice = scan.nextInt();
            if (choice == 1)
                high++;
            else if (choice == 2)
                low++;
            else
                System.out.println("invalid.");
            System.out.println("do you want to continue? (y/n)");
        } while (scan.next().equalsIgnoreCase("y"));

        Cabbage cabbage = new Cabbage(high, low);
        System.out.println("Total: $" + cabbage.calcVal());
        scan.close();
    }

    void sunday() {

    }

    public static void main(String[] args) {
        new Week12().saturday();

    }

}

class Cabbage {
    private int low;
    private int high;
    public static final double HIGH_PRICE = 12;
    public static final double LOW_PRICE = 5;

    public void setHigh(int num) {
        high = num;
    }

    public int getHigh() {
        return high;
    }

    public Cabbage() {
        high = 0;
        low = 0;
    }

    public Cabbage(int high, int low) {
        ;
        this.high = high;
        this.low = low;
    }

    public double calcVal() {
        return high * HIGH_PRICE + low * LOW_PRICE;
    }
}