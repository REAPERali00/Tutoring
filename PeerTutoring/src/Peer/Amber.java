package Peer;

public class Amber implements Starting {
    @Override
    public void start() {
        int n = 12;
        String name = "name".toUpperCase();
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello " + name);
        }
        System.out.println("Hi");
        if (true) {
            System.out.println();
        }
        if (true)
            System.out.println("hi");
    }

}