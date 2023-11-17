package Calendar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static int year = 2023; 
	public static int month = 11; 
	
	public static void read_inputs() {
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter year:");
				year = scan.nextInt(); 
				System.out.print("Enter month:");
				month = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("error, input did not match");
				scan.next();
				continue;
			}
		}while(year <= 0 || month <=0);
		scan.close();
	}

	
	public static void main(String[] args) {
		Calendar cal = new Calendar(year);
		cal.inject(month);
		
	}

}
