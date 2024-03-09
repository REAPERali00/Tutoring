package Winter2023;

public class Week9 {

    /*
     * if else statements
     * Loops
     * Arrays
     */
    void friday() {
        Student student = new Student();
        Student student2 = new Student();
        String s1 = student.getFullName("ALi", "jad");
        String s2 = new Student().getFullName("ALi", "jad");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("hi");
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        new Week9().friday();
    }
}
