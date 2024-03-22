package Winter2023;

public class Template {
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

    void sunday() {

    }

    public static void main(String[] args) {
        new Template().callDay(0);
    }
}
