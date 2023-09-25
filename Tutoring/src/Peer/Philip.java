package Peer;

import java.util.Scanner;

public class Philip {
	public static void main(String[] args) {
		Test test3 = new Test();
		Test test = new Test();
		Test test2 = new Test();
		test.n = 10;
		test2.n = test.n;
		System.out.println(test.n);
		System.out.println(test2.n);
		
		Scanner scan = new Scanner(System.in);
		//test.author("Ali");
//		System.out.println("Enter the author's name: ");
//		String name = scan.nextLine();
//		author("Ali");
//		author("Philip");
	}

}
