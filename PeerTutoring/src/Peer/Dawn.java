package Peer;

import java.rmi.server.ExportException;
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

    void inputRead() {
        Scanner scan = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.print("Enter num1: ");
        num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        num2 = scan.nextInt();

        System.out.println("the addition is " + (num1 + num2));
    }

    /**
     * Studfent
     * --
     * -id:int
     * -name:String
     * --
     * getId():int
     * -setId(id:int):void
     * 
     */
    void start() {
        System.out.println(getYearMessage(1999));
        Cabbage cab = new Cabbage(1.9, 2);
        System.out.println(cab.calcPrice());
        cab.name = "name of the cabbage";
        Cabbage cab2 = new Cabbage();
        System.out.println(Cabbage.name);
        double vol = 1.2;
        final double EXPECTED = 2;
        if (Math.abs(vol - EXPECTED) > 1)
            System.out.println("outside expectations ");

        // for(){

        // }
        // while(){

        // }
        // do {

        // }while(answer != "no");
    }

    String getYearMessage(int year) {
        int[] arr = { 2000, 1999, 1700 };
        String[] message = { "message for year 2000", "message for year 1999", "message for year 1700" };
        for (int i = 0; i < arr.length; i++) {
            if (year == arr[i])
                return message[i];
        }
        return "year not available";
    }

    public static void main(String[] args) {
        new Dawn().start();
    }
}
