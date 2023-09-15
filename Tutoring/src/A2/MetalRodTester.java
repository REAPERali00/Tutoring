package A2;

import java.util.Scanner;

public class MetalRodTester {

	public static void menu(Scanner scan, double rodUser, MetalRod rod) {
		
		System.out.println("Please enter the length of the rod in cm: ");
		if(scan.hasNextDouble()) {
			rodUser = scan.nextDouble();
			rod.checkValidity(rodUser);
			rod.printSuccessRate();
		}
		else {
			System.out.println("Please enter a numerical value");
			scan.next();
			menu(scan, rodUser, rod);
		}
			
	}
	
	public static void menu2(Scanner scan, double rodUser, MetalRod rod) {

		do {
			System.out.println("Please enter the length of the rod in cm: ");
			if(!scan.hasNextDouble()) {
				System.out.println("Please enter a numerical value");
				scan.next();
			}else {
				rodUser = scan.nextDouble();
				rod.checkValidity(rodUser);
				rod.printSuccessRate();
			}
		}while(!scan.hasNextDouble());
			
	}

	public static void main(String[] args) {
		double rodUser = 0;
		MetalRod rod = new MetalRod();
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		do {
			menu(scan, rodUser, rod);
			System.out.println("do you want to continue? (y/n)");
			choice = scan.next();
		}while(choice.equals("y"));
		scan.close();
	}

}
