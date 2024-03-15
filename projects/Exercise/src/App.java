import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Exercise exc = new Exercise();
        exc.registery("running", 150);
        exc.inquiry(scan);
    }
}
