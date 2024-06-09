package peer;

public class Student {
  private int id;
  private String name = "john";

  public void printHello() {
    System.out.println("hi, " + name + " how are you?");
  }

  public void printHello(String name) {
    System.out.println("hi, " + name + " how are you?");
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    if (id < 0)
      return;
    this.id = id;
  }

}
