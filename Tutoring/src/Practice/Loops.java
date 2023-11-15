package Practice;

public class Loops {
	/**
	 * write a program that takes in a nubmer, and adds up till that number. ex: n =
	 * 4, 1 + 2+ 3+4 = 10
	 * 
	 * @param n its the number that the user passes to add up till
	 */
	public void add_nums(int n) {
		// TODO write a for loop (what should the condition be? until when should we
		// loop?)
		// TODO what should you do in the for loop? how to keep tag on the total sum?
	}

	/**
	 * Write a program that prints the sum of all the even numbers from 1 to N,
	 * where N is a positive integer entered by the user.
	 * 
	 * @param n last number to sum till
	 * @return total sum
	 */
	public static int evenNumSum(int n) {
		// TODO write a for loop (what should the condition be ?)
		// TODO how to add up the even numbers? (hint: there are two ways)

		return 0;
	}

	/** Reverses an integer
	 * ex: num 123 returns 321
	 * @param num the passed on integer (Positive numbers only)
	 * @return returns the reversed number
	 */
	public int reverse_int(int num) {
		//TODO: Declarations: 
		
		 //TODO:Loop until number becomes zero or less
		{
			//TODO:get the last digit from num
			//TODO:remove the last digit form num
			//TODO:update the reversed number
		}
		//TODO:return the results
		return -1;
	}
	
	public static void printFibunachi(int n) {
		int prev = 1, current = 0; // save the prev and current number
		for (int i = 0; i < n; i++) {
			current += prev; // Update the current number to the next value in fibunachi
			prev = current - prev; // update the prev value to the value of current before the change
			System.out.printf("%d  ", current); // Print the new number
		}
		System.out.println(); // Go to next line
	}
}
