package Peer;

public class Stephen {
    public void studentExample() {
        Student student = new Student("Ali", 90, "cst8116", 1);
        student.printHello();

        // 1. Ali has a gpa of 90 in course cst8116
        System.out.println(student);
    }

    public static void main(String[] args) {
        new Stephen().studentExample();
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
