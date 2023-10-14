package MidtermPractice;


public class Main {
	
	private static Questions q = new Questions();
	
	public static void  questionNum(int n) {
		q.setCount(n);
		q.writeToFile();
	}
	
	public static void main(String[] args) {
//		questionNum(0);
		q.questions();
		
	}

}
