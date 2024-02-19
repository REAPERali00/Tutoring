package Winter2023;

class ExampleClass {
    public int var = 1;
    private int varPrivate = 2;

    public void someMethod() {
        System.out.println(var);
        System.out.println(varPrivate);
    }
}

public class Week2 {
    public static void friday() {
        // TODO Auto-generated method stub
        // Camel case: mainProgram: methods, vars, ...
        // Pascal: MainProgram: referenec type: class names
        // Snake: main_program
        System.out.println("Hello world");
        // syso + ctrl + space
        // alt + up/down arrow
        // ctrl + /
        int exampleNumberToRun = 0;
        System.out.println(exampleNumberToRun);

        int num = 0; // definition
        int num2 = (int) 12.9132123123123;
        double digit = 12;
        // declaration
        short n1;
        long n2;
        long num12 = 1231231231 * 1112312212;
        char c = 1;
        c = 'A' + 2;
        String s = "12313" + 123;
        System.out.println(s);
    }

    public static void saturday() {
        ExampleClass ex = new ExampleClass();
        ExampleClass ex2 = new ExampleClass();
        ex.someMethod();
        ex.var = 2;
    }

    public static void sunday() {

    }

    public static void main(String[] args) {
        sunday();
    }

}
