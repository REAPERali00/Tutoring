package Peer;

import java.util.Scanner;

/**
 * Class that contains method main.
 * 
 * @author Owner
 */
public class Ayomide implements Starting {
	

	public void prev_session() {

		Scanner scan = new Scanner(System.in);
		// One line only
		new Test().author("Ali");
		/*
		 * Variable types: primitive and reference
		 */
		String name = "hello world  ";
		name = name.trim();
		System.out.println(name.toUpperCase());
		int n = 2;
		Integer n1 = 3;

		int age = 11;
		System.out.println("Please enter the age");
		age = scan.nextInt();
		if (age > 12 && age < 20) {
			System.out.println("you are a teenager");
		} else if (age > 19) {
			System.out.println("you are a young adult");
		} else {
			System.out.println("You are a kid");
		}

		switch (age) {
		case 5:
			System.out.println("entered 5");
			break;
		case 13:
			System.out.println("entered 13");
			break;
		default:
			System.out.println("Option not included. ");
		}
	}
	
	
	/**
	 * date: 11/18/2023
	 */
	public void sat_session() {
		int cad_size = 7; 
		String gender = "female"; 
		convert(cad_size, gender);
	}
	
	public void convert(int cad_size, String gender) {
		int eu = 0; 
		switch(cad_size) {
		case 7: 
			if(gender.equals("female")) {
				eu = 30; 
			}
			break;
		}
		System.out.printf("%s EU size: %d\n", gender, eu); 
	}
	
	@Override
	public void start() {
		sat_session();
	}

}
