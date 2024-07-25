package system;

public class Dog extends Animal{

  private String breed; 

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.printf("Breed: %s\n", breed);

  }
}
