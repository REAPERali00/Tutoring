package Peer;

import java.util.Scanner;

public class Yining implements Starting{

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
	public  void firstSession() {
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
	
	public  void secondSession() {
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
	
	public  String printLetter(String letter) {
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
	
	public  void thirdSession(){
		char letter = 'B'; 
		System.out.print("You got ");
		if(letter == 'A' || letter < 'A')
			System.out.println("80-100");
		else if (letter >= 'B')
			System.out.println("70 - 79");
		String s = "some value"; 
		
		System.out.println(printLetter("C"));
	}
	
	public  void fourthSession() {
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
	
	/**
	 * Reverses an integer
	 * @param num the passed on integer (Positive numbers only)
	 * @return returns the reversed number
	 */
	public int reverse_int(int num) {
		//Declarations: 
		int rev = 0, digit = 0; 
		while(num!=0) { //Loop until number becomes zero or less
			digit = num % 10; //get the last digit from num
			num /= 10; //remove the last digit form num
			rev = rev*10 + digit; //update the reversed number
		}
		return rev; //return the results
	}
	
	/**
	 * Checks if a number is plaindrome or not
	 * Method is dependant on reverse_int()
	 * @param num the number to check for palindrome (no negatives)
	 * @return returns true if it is palindrome and false otherwise
	 */
	public boolean is_palindrome(int num) {
		//First way: 
//		if(num == reverse_int(num)) {
//			return true;
//		}
//		return false;
		return num == reverse_int(num); //check if the number is the same as its reverse.
	}
	
	/**
	 * Checks if a number is dig_num digits. 
	 * ex: (num, 5) checks if num is 5 digits 
	 * @param num the number to check digits for (no negatives)
	 * @param dig_num the total digit number (no 0 || negatives)
	 * @return returns true if the num has more then dig_num digits
	 */
	public boolean is_n_digits(int num, int dig_num) {
		return (num / (int)Math.pow(10,dig_num-1)) > 0; 
	}
	
	/**
	 * Starts the exe of the palindrome program 
	 */
	public void palindrome_main() {
		Scanner scan = new Scanner(System.in);
		int num = 0; 
		do {
			System.out.print("Enter the number (5 digit number): ");
			num = scan.nextInt();
			if(!is_n_digits(num,5)) {
				System.out.println("Please enter a 5 digit number...");
			}
		}while(!is_n_digits(num,5)); 
		
		if(is_palindrome(num)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
	
		System.out.println("the number is " + (is_palindrome(num) ?"":"not ")+ "Palindrome");
	}
	
	/**
	 * Starts the class execution
	 */
	public void start() {
		palindrome_main();
	}
	

}
