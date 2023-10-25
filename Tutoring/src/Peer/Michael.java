package Peer;

import java.util.Scanner;

public class Michael {
	/*
	 * Create a program that can take in student Information such as 
	 * ID, Name, Gpa, and course. The course can have a name and id, 
	 * and can display the total number of students for all courses. 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test test;
		Test test2 = new Test();
		int id, n; 
		System.out.println("Enter the id: ");
		id = scan.nextInt();
		System.out.println("Enter n: ");
		n = scan.nextInt(); 
		test = new Test(id,n);
		System.out.println(test + " "+test2);
		
	}
}
