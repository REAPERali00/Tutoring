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
        // Constructor, get/set, to string.
        // Instance of class Student, an object.
        int n = 34;
        Student student = new Student();
        Student student2 = new Student(20, "Alireza", 90, "cst8116");

        System.out.println(student.add(1));
        student.setId(12);
        System.out.println(student.getId());
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the password");
        student.setPassword(scan.nextLine());

        // new Student().id = 3;
        // System.out.println(new Student().id);

    }

    public static void saturday() {
        /*
         * start
         * Declarations:
         * num number1
         * num number2
         * String name
         * output "Hello world"
         * 
         * output "Enter the first number"
         * // * input number1
         * output "Enter the Second number"
         * input number2
         * 
         * output "The addition is " + number1 + number2
         * stop
         */
    }

    /**
     * Make a book class:
     * features:
     * 1. Name
     * 2. Author
     * 3. Content
     * 
     * Constructor: Default and a none default
     * Getter and a Setter (accessor, Modifier)
     */
    public static void sunday() {
        Scanner scan = new Scanner(System.in);
        Student st = new Student(12, "Ali", 90, "cst8116");
        st.setPassword("0000");
        st.print();
        new Student().print();
        // 3 PRints:
        int num = 12;
        System.out.print("Enter a number: ");
        // scan.nextInt();
        System.out.println("number: " + num + " is even ");
        System.out.printf("number: \"%d\" is %s\n", 12341, "even");
        System.out.println(st);
        System.out.println(new Student());

    }

    public static void main(String[] args) {
        sunday();
    }
}
