package Peer;

public class Kikelomo implements Starting {
    class A {
        public void ex() {
            System.out.println("Hello world");
        }
    }

    public int getSum(int num, int num2) {
        return num + num2;
    }

    public void printHello() {
        System.out.println("Hello");
    }

    public void conditionalStatments() {
        int age = 15;
        boolean checkAge = 13 <= age && age++ <= 19;
        System.out.println(checkAge + " " + age);
        if (checkAge) {
            System.out.println("checks out");
        } else {
            System.out.println("hi");
        }
        age = 20;
        if (age > 12 && age < 20) {
            System.out.println("you are teen");
        } else if (age > 19 && age < 50) {
            System.out.println("you are an adult");
        }
        switch (age) {
            case 20:
                System.out.println("you are 20");
                break;

            default:
                System.out.println("you are not 20");
                break;
        }
        age = 20;
        System.out.printf("you are %s20\n", age == 20 ? "" : "not ");
        System.out.printf("%s\n", age == 20 ? "you are 20" : "you are not 20");
    }

    public void loops() {
        // for, while, do while.
        int i = 0;
        for (; i < 10;) {
            System.out.println(i++);
        }

        while (i > 0) {
            System.out.println(i--);
        }

        do {
            System.out.println(i++);
        } while (i < 10);
    }

    public void arrays() {
        int arr[] = new int[12];
        int arr2[] = { 1, 2, 3 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + (i == arr2.length - 1 ? "\n" : " "));
        }
        System.out.println(arr2[1]);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        int dynamicArray[][] = new int[6][6];
        for (int[] row : dynamicArray) {
            for (int num : row) {
                if (num != 0) {
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }

    @Override
    public void start() {
        arrays();
    }
}
