package Peer;

public class Daniel implements Starting {
    private static class Example {
        public static void print() {
            System.out.println("Hello world");
        }
    }

    @Override
    public void start() {
        Example.print();
    }

}
