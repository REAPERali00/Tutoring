package Week3.instanceVariable;

public class Lecture3 {

	private int x;
	
	public void doIt(int val) {
		//int x =val;
		 this.x =val;
	}
	
	public void printIt() {
		System.out.println("x : "+ x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lecture3 lec3 = new Lecture3();
		lec3.doIt(5);
		lec3.printIt();

	}

}
