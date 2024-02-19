package Peer;

import java.util.Scanner;

public class Nat implements Starting{

	private final static Scanner scan = new Scanner(System.in);
	/**
	 * 1. Variable: primitive, reference
	 * 2. Classes and objects (reference type): 
	 * 3. in clsses: methods, getters/setters/constroctures, worker methods. 
	 * 4. conditional statements: booelan, if else, switch 
	 * 5. loops: for, while, do while
	 * 6. arrays. 
	 * etc. error, 

	 */
	public void variables() {
		//Declaration: create the var and say its color/type : type + name
		/*
		 * primitive: (value types)
		 * 1. int: -1, 0, 12, 12313
		 * 2. double : 12.2, -12.234234, 3.12312313123123123
		 * 3. float : 12.2 , -123.2, 3.1231
		 * 4. char: 'a', '1', '!'
		 * 5. boolean : true, false 
		 * 6. short 
		 * 7. long 
		 * 8. byte
		 */
		int num;
		num = 122;
		char c = 'a'; 
		
		/*
		 * reference types: 
		 * 
		 */
		Test test = new Test();
		Test test2 = new Test(12,12);
		new Test().n = 12;
		System.out.println(new Test().n);
		System.out.println(test2.getId());
		
		
	}
	
	/*
	 * logical operations: 
	 * == 
	 * != 
	 * > <
	 *>= <= 
	 *!
	 *&&
	 *||
	 */
	public void conditions() {
		int age =1 ; 
		if(age >=13 && age <= 19) {
			System.out.println("You are a teen");
		}
		else if(age >=19 && age < 30) {
			System.out.println("you are a young adult");
		}
		else {
			System.out.println("you are old");
		}
		System.out.println("Choose one of the following:"
				+ "\n1.option 1"
				+ "\n2.option 2"
				+ "\n3.option 3 ");
		
		int option = -12;
		switch(option) {
		case 1: 
			System.out.println("You chose option 1");
			break;
		case 2: 
			System.out.println("You chose option 2");
			break;
		case 3:
			System.out.println("You chose option 3");
			break;
			default: 
				System.out.println("Option not available");
		}
	}
	
	public int ask_user(String msg) {
		System.out.printf("%s: ", msg);
		return scan.nextInt();
	}
	public void print_arr(int[] arr) {
		String msg[] = {"Ages entered: ", "teens: ", "Adults: ", "Elderly: "};
		for(int i = 0; i < arr.length;i++ ) {
			System.out.printf("%s%d \n", msg[i],arr[i]);
		}
	}
	
	public int get_age_type(int age) {
		if(age >= 13 && age <= 19) {
			return 1;
		}else if(age >= 20 && age <=50 ) {
			return 2;
		}
		return 3;
	}
	public void assignment_practice() {
		int age_arr[] = new int[4]; 
		String choice = "y";
		do {
			int num = ask_user("Please enter an age");
			age_arr[get_age_type(num)]++;
			age_arr[0]++;
			print_arr(age_arr);
			System.out.print("do you want to continue? (y/n): ");
			choice = scan.next();
		}while(choice.equalsIgnoreCase("y"));
	}
	
	@Override
	public void start() {
		assignment_practice();
	}

}
