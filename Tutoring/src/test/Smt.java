package test;

public class Smt {

			
	public static void main (String[] args) {
		double rate = 0.1;
		int payDay = 10;
		double total = 0, starting = 1000;
		for(int i = 0; i < 6*365 ; i+=payDay) {
			starting += starting*rate;
			total += starting*rate;
		}
		System.out.println("The total ammount to pay is " + total);
		
	}
}