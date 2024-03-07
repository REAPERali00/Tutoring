package Peer;

import java.util.Scanner;

public class Dawn {
    private static class Student {
        private int num;
        private String name;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public Student() {
            num = 9;
            name = "no name";
        }

        public Student(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int addition(int num1, int num2) {
            System.out.println("hello wrold");
            return num1 + num2;
        }
    }

    void objExample() {
        Student st = new Student(13, "Ali");
        Student st2 = new Student();
        int numMain = 12;
        st.setNum(12);
        // st.addition(12, 12);
        System.out.println(st2.num);
        new Student().num = 12;
        System.out.println(new Student().addition(12, numMain));
        System.out.println(st.getNum());

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.print("Enter num1: ");
        num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        num2 = scan.nextInt();

        System.out.println("the addition is " + (num1 + num2));
    }
}
