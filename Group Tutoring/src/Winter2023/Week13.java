package Winter2023;

public class Week13 {
    private Runnable run[] = { () -> friday(), () -> saturday(), () -> sunday() };

    void callDay(int i) {
        if (i < 0 || i > run.length)
            return;
        run[i].run();
    }

    void friday() {
        System.out.println("Friday");
    }

    void saturday() {

    }

    void sunday() {

    }

    public static void main(String[] args) {
        new Week13().callDay(1);
    }
}
