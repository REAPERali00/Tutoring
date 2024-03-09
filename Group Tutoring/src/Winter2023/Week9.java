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

    void saturday() {
        /*
         * Logical operations:
         * == equals
         * > more then
         * < less then
         * >= greater or equal
         * <= less then or equal
         * ! not (basically flip boolean)
         * != not equal
         * && and (both sides most be true) true && true = true
         * || or (either one must be true) false || false = false
         */
        int age = 13;
        boolean ageCheck = age >= 13 && age <= 19;
        if (ageCheck) {
            System.out.println("Your a teenager");
        } else if (age >= 19 && age <= 40) {
            System.out.println("Your an adult");
        } else {
            System.out.println("You are elderly");
        }

        System.out.println(ageCheck);
    }

    public static void main(String[] args) {
        new Week9().saturday();
    }
}
