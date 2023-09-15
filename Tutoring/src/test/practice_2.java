package test;

/**
 * Use nested loops to print the following: 
 * *
 * **
 * ***
 * ****
 * up to however many lines the user gave! 
 * @author Alireza Jadidi
 *
 */
public class practice_2 {
	
	public void printStars(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printReverseStars(int n) {
		for(int i = 0; i< n; i++)
			for(int j = 0; j < n; j++)
				if(j < i)
					System.out.println("*");
				else 
					System.out.println(" ");
	}

}
