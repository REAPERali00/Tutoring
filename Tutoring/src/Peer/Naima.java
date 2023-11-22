package Peer;

import java.util.Scanner;

public class Naima implements Starting{
	
	/**
	 * 
	 * Topics: 0. Error types: Sysntax, Compile time, Run time, Logical 1.
	 * Variables: primitive and reference 2. Methods : code that is written
	 * somewhere else, and has a name.A method has a return type and a parameter. 3.
	 * Class, how to use code that is written in a different file. l 4. Class
	 * detail: instance variables, getter and setter (access modifiers) ,
	 * Constructors, other methods inside class.
	 * 
	 * 5. Conditional statements 6. loops 7. array
	 */
	
	public void firstSession() {
		//Declaration: type + name. 
		int m = 2;
		int n;
		// Definining it: 
		n = 3;
		/*
		 * Primitive: 
		 * 1. int: 0, 1, 2, 3
		 * 2. double: 2.3, 3.4, 2.333333333333333333333333333
		 * 3. float: 2.3 , 2.3333
		 * 4. char : 'A', 'B' , '3' 
		 * 5. boolean: true, false 
		 */
		double newvar = 5 / 2;
		
		//Short cut: syso + ctrl + space
		//System.out.println(newvar);
		
		char smt = 65;
		int smt2 = 'B';
		
		//System.out.println(smt + " " + smt2);
		 
		//Reference types: 
		Test smtToUse = new Test(); // Building, known as instance of Test or object. 
		//smtToUse.printHelloWorld();
		n = 3; 
		m = 0;
		//System.out.println(smtToUse.devideNum(n, m));
		
		Test smtUse2 = new Test();
		
		smtToUse.n = 2;
		//smtUse2.n = smtToUse.n;
		
		System.out.println(smtUse2.n);
//		System.out.println(new Test().n);
//		new Test().n = 3;
//		System.out.println(new Test().n);
	}

	public void secondSession() {
		Scanner scan = new Scanner(System.in);
		int age = 0; 
		System.out.print("Enter your age: ");
		//age = scan.nextInt();
		System.out.println("you are " + age + " years old.");
		
		System.out.print("Enter your name: ");
		String name = scan.next();
		/*
		 * int: %d
		 * double & float: %f
		 * String: %s 
		 * Char: %c 
		 * 
		 */
		System.out.printf("\"Hello\" %s\n", name); 
		System.out.println("Bye!");
		scan.close();
		
		
	}
	
	public void modify_int(int arr[]) {
		arr[0] += 4;
		System.out.println(arr[0]);
	}
	
	/*
	 * take the array, and change each of its values to start at 1 and 
	 * end at length. 
	 * ex: if arr[5], arr = {1,2,3,4,5}; 
	 */
	public void inject_arr(int[] arr) {
		for(int i = 0;i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	public void array_info() {
		int arr[] = new int[5]; //we use this when we don't know the exact elements.
		String names[] = {"Ali", "Naima"}; //Use this if you do know the elements
		//Prints from the last element till the first part of the array
		for(int i = names.length-1; i >= 0 ; i--) {
			System.out.printf("%d.%s\t", i, names[i]); //print the index and the element
		}
		System.out.println(); // Go to the next line 
		
		//Pass by reference example: 
		arr[0] = 2; 
		modify_int(arr);
		System.out.println(arr[0]);
		
		//Setting all the elements of the array to be i+1
		inject_arr(arr);
		
		//Printing the array. 
		for(int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
		
	}
	
	@Override
	public void start() {
		array_info();
	}

}
