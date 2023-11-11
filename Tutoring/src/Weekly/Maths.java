package Weekly;

public class Maths {
	public static int num; 
	public int num2; 
	public int add(int n, int m) {
		return n + m; 
	}
	
	public int div(int n, int m) {
		if(m == 0) { 
			System.out.println("Error, can't devide by 0.");
			return 0; 
		}
		return n / m; 
	}
	
	public long mult (long n, long m) {
		return n * m; 
	}
}
