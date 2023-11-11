package Weekly;

import java.util.Scanner;

public class Week11 {

	public static void menu() {
		System.out.println("choose an option: "
				+ "\n\t1.Addition"
				+ "\n\t2.Division"
				+ "\n\t3.Mult"
				+ "\n\t4.Exit");
	}

	public static void menuExe(int choice, Maths math, Scanner scan) {
		int n = 0, m = 0; 
		if(choice <4 && choice > 0) {
			System.out.print("Enter num1: ");
			n = scan.nextInt(); 
			System.out.println("Enter num2: ");
			m = scan.nextInt(); 
		}
		switch(choice) {
		case 1: 
			System.out.println(math.add(n, m));
			break; 
		case 2: 
			System.out.println(math.div(n, m));
			break;
		case 3: 
			System.out.println(math.mult(n, m));
			break; 
		case 4: 
			System.exit(0);
			break; 
		default: 
			System.out.println("Option is not implemented.");
		}
	}

	public static void friday() {
		Scanner scan = new Scanner(System.in); 
		Maths math3 = new Maths();

		menu();
		menuExe(scan.nextInt(), math3, scan); 
		friday();
		
		Maths math = new Maths(); 
		Maths math2 = new Maths(); 
		math.num = 12;
		math.num2 = 12;
		System.out.println(new Maths().num + " " + math2.num2);
	}

	public static void saturday() {
		//Find the related file under Weekly Guessig_Game.java
		new Guessing_Game().start();
	}
	
	public static void main(String[] args) {
		saturday();
	}

}
