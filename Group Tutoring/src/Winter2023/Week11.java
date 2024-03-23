package Winter2023;

public class Week11 {

    private Runnable run[] = { () -> friday(), () -> saturday(), () -> sunday() };

    void callDay(int i) {
        if (i < 0 || i > run.length)
            return;
        run[i].run();
    }

    void friday() {
        System.out.println("hello");
    }

    void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    /*
     * populate an array's elements starting form 1 till its length.
     * ex: arr[10] => 1, 2, 3, 4, 5 ,...., 10
     */
    void populateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    void saturday() {
        // print numbers form 1 - 10
        // for (int i = 2; i <= 100; i += 2) {
        // System.out.print(i + " ");
        // }
        // for (int i = 100; i > 0; i--) {
        // System.out.print(i + " ");
        // }
        int n = 12, m, c, d, gkj;
        int arr[] = new int[100];
        int arr2[] = { 1, 2, 3, 4, 5, 6, 2, 12, 232 };
        printIntArray(arr);
        populateArray(arr);
        printIntArray(arr);

    }

    void sunday() {

    }

    public static void main(String[] args) {
        new Week11().callDay(1);
    }
}
