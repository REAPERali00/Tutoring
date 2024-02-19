package Peer;

public class Yasmine implements Starting {
    private static class Example {
        public static int num;

        public int getNum() {
            return num;
        }

        public void setNumEven(int num) {
            if (num % 2 == 0)
                this.num = num;
            else
                System.out.println("NOpe.");
        }

        public void print() {
            System.out.println("Hello world");
        }

        public void print(String name) {
            System.out.println("Hello " + name);
        }

        public int equation() {
            return num + 2;
        }
    }

    public void practice() {
        final int num = Math.min(0, 0);

        Example ex = new Example();
        Example ex3 = ex;
        Example ex2 = new Example();
        Example.num = 12;
        ex.setNumEven(11);
        System.out.println(ex.num);
        ex.print("Yasmine");

    }

    @Override
    public void start() {
        System.out.println("Starting the main...");
        practice();
    }

}
