package Peer;

public class Gurnoor {
    private static class Example {
        private int num;
        private String name;

        // Constructors
        public Example() {
            this(1, "ALI");
            // num = 12;
            // name = "Default name";
        }

        public Example(int num) {
            this(num, "Default name");
        }

        public Example(int num, String name) {
            this.name = name;
            this.num = num;
        }

        // Getters/setters
        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int addition(int num1, int num2) {
            int result = num1 + num2;
            return result;
        }

        public void printAddition(int num1, int num2) {
            System.out.println("The result of the addition is " + addition(num1, num2));
        }

        public String toString() {
            return String.format("%s, you are number %d", name, num);
        }
    }

    /**
     * Conditional statements: if else, booleans, logical opersations
     * Loops: for, while, do while loop
     * array: bunch
     */
    public static void main(String[] args) {
        int num = 4, num2 = 8;
        Example ex = new Example(1, "Ali");
        Example ex2 = new Example(45);
        ex2.setName("ALi");
        ex2.setNum(12);

        System.out.println(ex2);
        System.out.println(ex.num);
        ex.printAddition(num, num2);
        ex.addition(num, num2);

        ex.printAddition(1, num2);
    }
}
