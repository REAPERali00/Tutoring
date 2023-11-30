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
	

	public void do_while_example() {
		String number = " ";
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter 1 to exit: ");
			number = scan.next();
		}while(!number.equals("1"));
	}
	
	/*
	 * reverse the integer array, 
	 * ex: arr: 1,2,3,4
	 * make it arr: 4,3,2,1
	 */
	public void reverse_array(int arr[]) {
		int length = arr.length;
		for(int i = 0; i <  length/2; i++) {
			int temp = arr[i]; 
			arr[i] = arr[length-1-i]; 
			arr[length-1-i] = temp; 
		}
	}
	
	public void array() {
		int arr [] = new int[700];
		arr[0] = 12;// the first element is always 0
		arr[arr.length-1] = -12; //the last element is always length-1.
		
		//Now we want to use loops, to change the elements. 
		//arr = 1,2,3,4,5,....
		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i * 2 + 1;
			arr[i] = i+1;
		}
		
		String names[] = {"Name 1", "John", "Smith", "New name"}; 
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s, ", names[i]);
		}
		reverse_array(arr);
	}
	
	@Override
	public void start() {
		array();
	}

}
