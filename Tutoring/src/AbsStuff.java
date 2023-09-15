
interface D{
	
}
interface A extends D {
	int SMT = 10;
}
abstract class B implements A, D{
	
}
class C extends B{
	public int smt() {
		return SMT;
	}
}
public class AbsStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
