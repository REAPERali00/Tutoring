package Peer;

public class Stephen {
    public void studentExample() {
        Student student = new Student("Ali", 90, "cst8116", 1);
        student.printHello();

        // 1. Ali has a gpa of 90 in course cst8116
        System.out.println(student);
    }

    public static void main(String[] args) {
        double result = 123.626;
        System.out.printf("the result is %.3f\n", result);
        // Conditional statement: boolean
        // loops: while, for, Do while
        // arrays:
        int arr[] = { 1, 2, 3, 4 };
        Student stdArray[] = new Student[10];
        stdArray[0] = new Student();
        stdArray[0].printHello();

        System.out.println(arr[1]);
    }

    private static class Student {
        private String name;
        private double gpa;
        private String courseName;
        private int id;

        public Student() {
            name = "No name";
            gpa = -1;
            id = 12;
            courseName = "N/A";
        }

        public Student(String name, double gpa, String courseName, int id) {
            this.name = name;
            this.gpa = gpa;
            this.courseName = courseName;
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void printHello() {
            System.out.println("Hello " + name);
        }

        public void printHello(String name) {
            System.out.println("Hello " + name);
        }

        public String toString() {
            return String.format("%d. %s has a gpa of %.2f in course %s.", id, name, gpa, courseName);
        }
    }

}
