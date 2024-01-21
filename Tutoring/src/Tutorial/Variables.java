package Tutorial;

public class Variables {

	public void vars() {
		/**
		 * Java Has two types of variables, primitve and reference types.
		 * you can tell them apart by either seeing the first letter of the type
		 * being capital (ex: String) or has id in the debugger.
		 */
		// Primitives:
		primitive_vars();
		// References:
		reference_var();
	}

	void primitive_vars() {
		/*
		 * Primitive types (Value types) are pre defined, and are usually small enough
		 * to re make or
		 * re use the entire variable, hence the value type.
		 * declaration: type + name (Camel case)
		 * instantialize/ define: type + name = value
		 */
		// the types are:
		// 1. byte/short/int/long: 0,-1,3,... (any whole number)
		int num = 3;
		// 2. float/double: 1.2, 1.4, -1.0, 0.0, ... (has decimal points)
		double d = 1.2;
		// 3. char: '1', 'a', '@', (any thing between SINGLE quotation)
		char c = 'A';
		// 4. boolean: true, false. only has these two values.
		boolean flag = true;

		// Now things will start to get weird!
		double d2 = 5;
		// System.out.println(d2); // what do you think this prints?

		d2 = 5 / 2;
		// System.out.println(d2); // what about now?

		d2 = 5.0 / 2;
		// System.out.println(d2); // what about now?

		// that was doubles to int, what if we now try characters?
		char c2 = 65;
		// System.out.println(c2); // what will this line print? 6? 5? 65? or something
		// else?
		// System.out.println((char)97); //This is called casting, we are telling the
		// computer to turn 97 to char.

	}

	void reference_var() {
		/*
		 * Reference types are a bit more advanced, however declarations are the same.
		 * for primitive types, we can put a number on the right hand side, but what do
		 * references hold?
		 * essentially, inside a reference goes a reference (shocker).
		 * what that means, is instead of the actuall variable, there is an id. id is
		 * basically the location
		 * of the actual object.
		 * why? well, primitive types are small, and have a determined size. imagine
		 * them as a small box,
		 * easy to move around. reference types (or objects, classes, instances, so on)
		 * are like a massive heavy box.
		 * we don't want to move them around as they are big and heavy, we can but its
		 * taxing.
		 * so instead we will just tell people where the box is(ie the address, or id)
		 * and they can go grab
		 * whatever they want from the box.
		 * now thats enough theory, lets get to the nitty gritty stuff!
		 */

		// bellow, you can find the mini class (reference type) we will use here to see
		// how we can use it:
		Refs reference; // see, so far its just like primitives. types + name!
		// but, what are we supposed to put on the right side?
		reference = new Refs(); // well, the right hand side is new ClassName(), this is the constructor which
								// we will learn later.
		// alright, we now made the reference instance, or object of type Refs. now how
		// do I use my stuff in it?
		// simple, just say the var name follwed by a .
		reference.num = 2; // Like this!
		// System.out.println(reference.num); // and this prints num inside reference!

		Refs reference2 = new Refs(); // now, lets make a second one!
		// System.out.println(reference2.num); // what will this print? 2?
		// lets get weirder.
		// System.out.println(new Refs().num); // what will this do?!

		new Refs().num = 2;
		// System.out.println(new Refs().num); // what will this do?

	}

	// Congrats! you now know the basics of variables!

}

class Refs {
	public int num;
}
