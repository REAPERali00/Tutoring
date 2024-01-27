package Winter2023;

import java.util.Scanner;

public class Week3 {

    /*
     * What we will go over this week:
     * 1. Project for Saturday: Exercise program / Calculator / Any other Idea
     * 2. Topic of the Week: Classes and objects. / Reference types.
     */
    public static void friday() {
        // Student Class: name, id, gpa, course name.
        // Consctor, get/set, to string.
        // Instance of class Student, an object.
        int n = 34;
        Student student = new Student();
        Student student2 = new Student(20, "Alireza", 90, "cst816");

        System.out.println(student.add(1));
        student.setId(12);
        System.out.println(student.getId());
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the pasword");
        student.setPassword(scan.nextLine());

        // new Student().id = 3;
        // System.out.println(new Student().id);

    }

    public static void saturday() {
        /*
         * start
         * Decalartions:
         * num number1
         * num number2
         * String name
         * output "Hello world"
         * 
         * output "Enter the first number"
         * intput number1
         * output "Enter the Second number"
         * intput nubmer2
         * 
         * output "The addition is " + number1 + number2
         * stop
         */
    }

    public static void main(String[] args) {
        friday();
    }
}
