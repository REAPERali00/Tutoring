package Weekly;

public class Week10 {
	/*
	 * 1. Variable: primitive, reference
	 * 2. method: main 
	 * 3. classes: Instance varaibles, getter/setter, constructor, worker methods
	 * 
	 * 4.conditional statemes: if, else, else if, switch. boolean
	 * 5. loops: for, while, do while
	 * 6. arrays
	 */
	public static void friday() {
		/*
		 * primitive: Value type, small pre described val.  
		 * 1.int: 2, 4, -12, 0 
		 * 2.float: 2.23, 0.0, 10.0
		 * 3.double: 2.234222234
		 * 4.char: 'a', 'A', ' '. '!'
		 * 5.boolean, short, long, byte
		 */
		//Declaration: type + name(follow convention)
		int num;
		//Definition: when you give it a value for first time. 
		num = 3;
		double d = 10;
		num = (int) 10.9;
		char c = 'A' + 25 ;
		num = c;
		System.out.println(c);
		
		//Reference: 
		Student st = new Student(); 
		Student st2 = new Student(); 
		st.id = 10; 
		new Student().id = 10;
		System.out.println(new Student().id);
		st.printName("Hello", "Ali");
		st.devision(12, 2);
		System.out.println(st.devision(-10,0));
	}
	
	public static void main(String[] args) {
		friday();
	}

}
