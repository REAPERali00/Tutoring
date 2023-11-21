package Peer;

import java.util.Scanner;

public class Zarko implements Starting{
	private int num; 
	
	public Zarko() {
		this(0);
	}
	public Zarko(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * Method take in int number, and returns the reversed number. 
	 * @param num
	 * @return
	 */
	public int reverseInt() {
		int reverse = 0; //We use this to store the reversed number. 
		
		while(num > 0) { 
			//1. update the reversed, and take the current last digit of num, ex: num 123 => rev = rev * 10 + 3 (num % 10)
			reverse = reverse * 10 + num % 10; 
			//2.update the num to remove the last digit as we no longer need it. 
			num /= 10;  // num = num / 10; 
		}
		return reverse;
	}
	
	/**
	 * Take a num, and return ture if it is palindrome, and false otherwise. 
	 * @param num any postive integers, 5 digits. 
	 * @return true if it is palindrome, and false if not. 
	 */
	public boolean isPalindrome() {
		return (num == reverseInt());
	}
	public boolean is_n_digits(int dig_length) {
		return (num / (int)Math.pow(10, dig_length-1)) > 0;
	}
	@Override
	public void start() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = scan.nextInt(); 
		if(!is_n_digits(5) || is_n_digits( 6)) {
			System.out.println("please enter a 5 digit number");
			start();
		}
		if(isPalindrome()) { 
			System.out.println("Yes, the number is palindrome");
		}else { 
			System.out.println("No, the number is not palindrome ");
		}
		
		start();
		
	}

}
