package Peer;

public class Lorena {
    public static class Example {
        // Instance Variables:
        private int num;

        // Constructor:
        public Example() {
            num = 12;
        }

        // Getters/Setters:
        public int getNum() {
            return num;
        }

        // worker methods:
        public int add(int num1, int num2) {
            return num1 + num2;
        }

        public void methodExample() {
            System.out.println("");
            // Primtives and references.
            int num = 0;
            // num = 12;
            System.out.println(num);
            Example example = new Example();
            System.out.println(example.add(1, 2));

        }

    }

    public static void main(String[] args) {

    }
}
