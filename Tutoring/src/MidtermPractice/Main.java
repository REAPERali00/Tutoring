package MidtermPractice;


public class Main {
	
	private static Questions q = new Questions();
	
	public static void  questionNum(int n) {
		q.setCount(n);
		q.writeToFile();
	}
	
	public static void main(String[] args) {
		questionNum(12);
		q.questions();
		 Boolean b;
		 boolean b1;
		
	}

}
