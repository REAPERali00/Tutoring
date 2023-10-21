package Shipmenty;

public class Main {
	
	public static void div(int n, int m) {
		if(m != 0)
			System.out.println(n/m);
		
	}
	
	public static int add(int n, int m) {
		return n + m;
	}
	
	/*
	 * This method takes a year, and checks if its a leap year or not. 
	 * to check: year has to be divisible by 4. and if year is divisible by 100, it 
	 * must also be divisble by 400 
	 */
	public static boolean isLeap(int year) {//modula
		return!( year % 4 != 0 || year %100 == 0 && year %400 !=0); 
//		return year % 4 == 0 && (year % 100 == 0 && year %400 == 0); 
	}
	
	
	public static void main(String[] args) {
//		Package p = new Package(1,1,3);
//		p.displayDimentions();
		int age = 19; 
		//boolean flag = age > 12 && ++age < 20; // == , !, !=, < , > , >=, <=, &&,|| 
//		if(age > 12 && age++ < 20)
//			System.out.println("Yes you are a teen!");
//		else
//			System.out.println("You are not a teen!");
//		System.out.println(age);
//		if(isLeap(100))
//			System.out.println("Its a leap year!");
//		else 
//			System.out.println("Its not a leap year!");
		System.out.println(isLeap(400)? "Its a leap year!": "Its not a leap year!");
		System.out.printf("Its%s a leap year!\n", isLeap(400)?"": " not" );
	}

}
