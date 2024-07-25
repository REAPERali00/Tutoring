package system;

class A{ 
  protected int n = 12; 

  public A(){
    System.out.println("a");
  }
  public A(int n){
      this.n = n;
    System.out.println("a");
  }

  public int add(int n1, int n2){
    return n1 + n2;
  }
  public double add(double n1, double  n2){
    return n1 + n2;
  }

}

class B extends A{
  private int num; 

  public B(){
    System.out.println("b");
  }

  public B(int num){
    System.out.println("b");
      this.num = num;
  }
  public void smt(){
    System.out.println(n);
  }

  public int add(int n1, int n2){
    return n1 + num;
  }
}
interface I {
  double PI = 3.14;
  void print();
}
class abstract C {
  public abstract void print();


}

class D extends C{

  public  void print(){
    System.out.println("thsi is D");
  }

}


public class App 
{
    public static void main( String[] args )
    {
      A b = new B();
     C c = new D();
      Animal [] a = {new Dog(), new Dog(), new Cat()};
    for (Animal curr : a)
      a.printInfo();
      
      b.smt();
      b.add();
    }
}
