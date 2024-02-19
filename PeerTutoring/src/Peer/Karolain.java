package Peer;

public class Karolain implements Starting {
	/*
	 * 1. variable: primitive, reference. created in stack primitive: byte, short,
	 * int, long: -1, 0, 2, ... float, double: 1.0, 2.23, -123.3, 3.1459123123 char:
	 * '1', 'a', '#' boolean: true, false Reference types: letters start with
	 * capital, hold id. (address) created in Heap. 2. Methods: like a variable, but
	 * it holds the location of a bunch of code. its best to have a method do one or
	 * two things at most. to make a method, we need three parts.
	 * 
	 * 
	 */

	@Override
	public void start() {
		int num = 123123123;
		String name = "Ali".toLowerCase();

		System.out.println("Ali".toLowerCase() + name);
		System.out.println(name + name.toUpperCase());
		// static_example();
		author_given_name("Ali");
		author();
		example_return_type();
	}

	public void static_example() {
		Smt_1234 smt = new Smt_1234();
		Smt_1234 smt2 = new Smt_1234();
		smt.n = 11;
		smt.n2 = 12;
		System.out.println(smt2.n + " " + smt2.n2);
	}

	public void author() {
		System.out.println("Program by some name.");
	}

	public void author_given_name(String name) {
		System.out.printf("Program by %s\n", name);
		System.out.print("Program by " + name + ".\n");
	}

	public void example_return_type() {
		Smt_1234 smt = new Smt_1234("New secret message");
		System.out.println(smt.get_secret());
		System.out.println(smt);
	}

}

class Smt_1234 {
	public static int n;
	public int n2;
	private String secret_msg;

	public String get_secret() {
		System.out.print("you are geting the code: ");
		return secret_msg;
	}

	public Smt_1234() {
		n = -1;
		n2 = -1;
		secret_msg = "Here is the secret...";
	}

	public Smt_1234(String msg) {
		n = -1;
		n2 = -1;
		secret_msg = msg;
	}

	public String toString() {
		return String.format("Here is the secret code: %s sky is blue!", secret_msg);
	}
}
