package Peer;

class ErnestExample {
    private int id;

    public int add(int num1, int num2) {
        int addition = num1 + num2;
        return addition;
    }

    public void print() {
        String s = "hello";
        System.out.print("Hello\n");
        System.out.println(s + " world\n");

        System.out.printf("Hello %s\n", "world");
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Constructors
    // Default Constructer
    public ErnestExample() {
        id = -14;
    }

    // None Default Constructor
    public ErnestExample(int id) {
        this.id = id;
    }
}

public class Ernest {

    public static void main(String[] args) {
        // Variables: primtive, reference.
        // Declaration: type + name
        int num = 0;
        double d = 1.2;
        char c = '!';
        int id;
        // Reference:
        ErnestExample example = new ErnestExample(12);
        example.print();

        int result = example.add(1, 3);
        example.setId(12);
        System.out.println(example.getId());

    }
}
