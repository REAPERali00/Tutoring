package Weekly;

public class Week12 {
	
	/**
	 * write a program that takes in a nubmer, and adds up till that number. ex: n =
	 * 4, 1 + 2+ 3+4 = 10
	 * 
	 * @param n its the number that the user passes to add up till
	 */
	public static int add_nums(int n) {
		// TODO write a for loop (what should the condition be? until when should we
		// loop?)
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			// TODO what should you do in the for loop? how to keep tag on the total sum?
			sum = sum + i; 
		}
		return sum;
	}
	
	/**
	 * Write a program that prints the sum of all the even numbers from 1 to N,
	 * where N is a positive integer entered by the user.
	 * ex: n = 4: 2 + 4 = 6;
	 * @param n last number to sum till, don't put negatives, won't work! 
	 * @return total sum
	 */
	public static int evenNumSum(int n) {
		if(n < 0) {
			System.out.println("Sorry, negative numbers aren't allowed here. ");
			return -1;
		}
		// TODO write a for loop (what should the condition be ?)
		int sum = 0;
		/*
		 * for(int i = 1; i <= n;i++) { // TODO how to add up the even numbers? (hint:
		 * there are two ways) if(i % 2 == 0) { sum += i; } }
		 */
		for(int i = 2; i <= n;i+=2) sum+=i;
		
		return sum;
	}
	
	/** Reverses an integer
	 * ex: num 123 returns 321
	 * @param num the passed on integer (Positive numbers only)
	 * @return returns the reversed number
	 */
	public static int reverse_int(int num) {
		//TODO: Declarations: 
		int reverse = 0;
		 //TODO:Loop until number becomes zero or less
		while(num != 0)
		{
			//TODO:get the last digit from num
			//TODO:remove the last digit form num
			//TODO:update the reversed number
			reverse = reverse * 10 + num% 10;
			num /= 10;
		}
		//TODO:return the results
		return reverse;
	}
	
	/**
	 * Write a Java program to determine whether a given year is a leap year or not.
	 * A leap year is a year that is divisible by 4, except for years that are
	 * divisible by 100 but not divisible by 400. Your program should prompt the
	 * user to enter a year and display whether it is a leap year or not.
	 * 
	 * Enter a year: 2024 2024 is a leap year.
	 * 
	 * Enter a year: 1900 1900 is not a leap year.
	 * 
	 * Enter a year: 2000 2000 is a leap year.
	 * 
	 * @param year
	 */
	public static boolean is_leap(int year) {
		// TODO check if the year is divisible by 4 (which math operation should you
		// use?)
		/*
		 * if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) { // TODO check if
		 * the year is divisible by 100, is it also divisible by 400? return false; }
		 * return true;
		 */
		// TODO is there a better way to do this? what if we check negative conditions
		// instead of positive ones?
		
		return !(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)); 
		
	}

	public static void firday() {
//		System.out.println(add_nums(4));
//		if(evenNumSum(-12) != -1) {
//			System.out.println(evenNumSum(-12));
//		}
//		System.out.println(reverse_int(12345667));
//		if(is_leap(400)) {
//			System.out.println("Its a leap year!");
//		} else {
//			System.out.println("Its not a leap year!");
//		}
		System.out.printf("Its %sa leap year!\n", is_leap(100)?"":"not ");
	}
	
	public static void main(String[] args) {
		firday();
	}

}
