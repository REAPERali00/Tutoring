package peer;

import java.util.Scanner;

public class Palwasha {

  private int num;

  public void studetStuff() {
    Student ali = new Student();
    ali.printHello();
    ali.setId(-1);
    System.out.println(ali.getId());
  }

  public void eggExample() {

    Scanner input = new Scanner(System.in);
    Egg egg = new Egg();
    int medCount = 0;
    int largeCount = 0;

    System.out.print("Enter the medium count for eggs: ");
    medCount = input.nextInt();
    System.out.print("Enter the large count for eggs: ");
    largeCount = input.nextInt();

    egg.setLargeCount(largeCount);
    egg.setMediumCount(medCount);

    System.out.println(egg);
  }

  public void run() {
    eggExample();
  }
}
