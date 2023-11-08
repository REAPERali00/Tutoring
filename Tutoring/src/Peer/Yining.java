package Peer;

import java.util.Scanner;

public class Yining {

	/*
	 * Variables : additions, modula, division: += ++ -- 
	 * Classes: Methods (ex: print hello world, method that prints name , does addtion), getter and setter, 
	 * Constructors
	 * Conditional statements: booleans, <, > , <=, ==, !=, !, &&, || 
	 * if else elseif, switch 
	 * 
	 * 
	 * 
	 */
	public static void firstSession() {
		int n ; 
		Test2 test = new Test2();
		Test2 test2 = new Test2();
		test2.n = 2; 
		if(test2.n > 3) {
			System.out.println("The number is bigger then 3");
		}
		else {
			System.out.println("THe number is smaller then 3");
		}
		System.out.println(test2.add(12));//syso + ctrl + space 
	}
	
	public static void secondSession() {
		Test test= new Test(1,2);
		Scanner scan = new Scanner(System.in); 
		double weight;
//		System.out.println("Enter the weight");
		int n = 1212312312;
		int m = 1212312312;
		System.out.println(n + m);
		System.out.println(test.devide(1, 0));
		n = 12;
		weight = scan.nextDouble();
	}
	
	public static String printLetter(String letter) {
		String result = ""; 
		switch(letter) {
		case "A": 
			result = "80-100";
			break;
		case "B": 
			result = "70-79";
			break; 
		case "C": 
			result = "60-69";
			break; 
		case "D": 
			result = "50-59";
			break; 
			default: 
				result = "Not implemented."; 
		}
		return result;
	}
	
	public static void thirdSession(){
		char letter = 'B'; 
		System.out.print("You got ");
		if(letter == 'A' || letter < 'A')
			System.out.println("80-100");
		else if (letter >= 'B')
			System.out.println("70 - 79");
		String s = "some value"; 
		
		System.out.println(printLetter("C"));
	}
	
	public static void fourthSession() {
//		Scanner scan = new Scanner(System.in);
//		if(scan.next() == "ABC333")
//			System.out.println("Yes");
		int ticket = 10;
		if(ticket > 0 && ticket < 100) {
			/*
			 * %d: int 
			 * %s: String
			 * %c: char 
			 * %f: flaot and double 
			 * 
			 */
			System.out.printf("please sit on the %s seat.\n", ticket%2 ==0? "right": "left");
		}
		int crs = 12;
		System.out.printf("Course %s: %d", "number", crs);
		/*
		 * Leap year: if the year given is divisible by 4, its a leap year. however, if
		 * the year is divisible by 100, it should also be divisible by 400.
		 */
	}
	
	public static void main(String[] args) {
		fourthSession();
	}
	

}
