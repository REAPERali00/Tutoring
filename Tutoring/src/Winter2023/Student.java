package Winter2023;

public class Student {
    // Instance Variables / attributes
    private int id;
    private String name;
    private double gpa;
    private String courseName;
    private String password;
    private int encription = 32;

    // Get / Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = encrypt(password);

    }
    // Constructor :

    // Default constructor
    public Student() {
        this(120, "No name", -1, "N/A");
        // id = 120;
        // name = "No name";
        // gpa = -1;
        // courseName = "N/A";
    }

    // // NOne default constructor:
    public Student(int id, String name, double gpa, String courseName) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.courseName = courseName;
    }

    public Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;

    }

    public int add(int num1) {
        return num1 + id;
    }

    public String getFullName(String fname, String lname) {
        return fname + " " + lname;
    }

    public void print() {
        System.out.printf("%d.%s: GPA: %.2f Course: %s Password: %s\n", id, name, gpa, courseName, password);
    }

    @Override
    public String toString() {
        return String.format("%d.%s: GPA: %.2f Course: %s Password: %s\n", id, name,
                gpa, courseName, password);
    }

    private String encrypt(String password) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            sb.append((char) (password.charAt(i) + encription));
        }
        return sb.toString();
    }

    private String decript(String password) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            sb.append((char) (password.charAt(i) - encription));
        }
        return sb.toString();
    }

}
