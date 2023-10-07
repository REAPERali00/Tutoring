package Weekly;

import java.util.Scanner;

public class Week4 {
	
	public static void friday() {

		/**
		 * Primitive: 
		 * int -1 , 9 ..
		 * double: 12.4  
		 * float:  1.4 
		 * char: 'A', '3', '!' 
		 * boolean: true, false 
		 */
		//Declaration and definition: 
		int n = 5;
		//Declaration: type + name: int + num 
		double d = n * 1.0 / 2;
		char c = 97;//Asci table 
		int c2 = 'a';
		//n =(int) d;
		//System.out.println(c);//syso + ctrl + space

		//References: 
		Circle circle = new Circle(12, "Circle"); 
		//		circle.setRadius(12);
		System.out.println(circle);
		Circle circle2 = new Circle(3, "Round");
		System.out.println(circle2 + "\nGood bye!");
		/*
		 * int: %d
		 * double and float: %f
		 * string %s
		 * char %c
		 */
		//		System.out.printf("The radius is: %d \n", circle.getRadius()); 

	}
	
	public static void main(String[] args) {
		saturday();
	}

	/**
	 * Rectangle: height + width 
	 * whats the area? 
	 * 
	 */
	public static void saturday() {
		//Refernce Types: 
		Scanner input = new Scanner(System.in);
		Rectangle rec ;//Instance of class Rectangle. Object
		int height = 0, width = 0; 
		
		
		 System.out.print("Please enter the height: "); 
		 height = input.nextInt();
		 System.out.print("Please enter the width: "); 
		 width = input.nextInt();
		 	
		rec = new Rectangle(height, width);
		
		/*
		 * System.out.println(rec.getHeight());
		 * 
		 * rec.setHeight(height); rec.setWidth(width);
		 */
		
//		System.out.println("Width: " + width + " Height: " + height);
		/*
		 * int: %d
		 * float/double: %f
		 * String: %s
		 * char: %c
		 * 
		 */
		System.out.println(rec);
		
		
	}
	
}
