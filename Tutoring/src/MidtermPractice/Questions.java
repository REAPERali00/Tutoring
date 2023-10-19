package MidtermPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Questions {
	// 100 Students. each time you wish to create a student, you want to increase
	// the count. how can you do this?
	private int count;
	private String path = "count.txt";
	private File file;

	public Questions() {
		count = 1;
		file = new File(path);
	}

	public void writeToFile() {
		try {
			PrintWriter writer = new PrintWriter(new FileOutputStream(file));
			writer.println(count);
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("couldn't find the file. ");
		}
	}

	public void readFile() {
		try {
			Scanner scan = new Scanner(file);
			count = scan.nextInt();

			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void questions() {

		readFile();

		switch (count) {
		case 1:
//			What is the output from the following Java statement: 
			System.out.println("(>\'.\')>");
//		
//			(>'.')>
//
//			"(>\'.\')>"
//			
//			(>\'.\')>
//
//			('.')
			break;

		case 2:
//			Given: String abc = "1 2 3"; what will print out from the following 
			// statement?
			String abc = "1 2 3";
			System.out.println(abc  + abc.length());
//
//			abc.length()
// 			1 2 3 5
//			1 2 35
//
//			1 2 33
//
//			123
			break;
		case 3:
			Double result = 0.0;
//			Which of the arithmetic expressions below will assign a value of 
//			1.0 into variable double result?
//
//					result = 5.0 * 2;
//
//					result = 5.0 / 2;
//
//					result = 5.0 - 2;
//
//					result = 5.0 % 2; 
			
			System.out.println(result);
			break;
		case 4:
//			What is the output from the statement: 
			System.out.println((double) (5 / 2));
//
//			2.0
//
//			5 / 2
//
//			2.5
//
//			2
			break;
		case 5:
//			Which answer correctly orders the Java integer data types from 
//			largest memory use to smallest memory use? 
//			(left is largest, moving towards the right and ending with smallest)
//
//
//					int, short, byte, long
//
//					short, byte, long, int
//	
//					byte, short, int, long
//
//					long, int, short, byte
			System.out.printf("%d %d %d %d", Integer.BYTES, Short.BYTES, Byte.BYTES, Long.BYTES);
			break;
		case 6:
//			Which of the following identifiers for a last name, follow Java programming conventions for a variable name?
//
//					lastname
//
//					l_a_s_t_n_a_m_e
//
//					LastName
//
//					lastName
//			Which of the following is a valid Java identifier (name) for a class, in other words which one of the 
//			following will compile?
//
//
//					Hello World
//
//					BaseballBat
//
//					42LifeTheUniverse
//
//					this
			/*
			 * What command will configure Git with an email address?
			 * 
			 * config --global git with your.name "your name"
			 * 
			 * git --global config email as "your@email.com"
			 * 
			 * git config --global user.name "your name"
			 * 
			 * git config --global user.email "your@email.com"
			 */
			
			/*
			 * Given the class declaration: public class Greeting, the compiled class
			 * byte-code file produced by the compiler is __________.
			 * 
			 * greeting.java.class 
			 * Greeting.java
			 * Greeting.bytecode 
			 * Greeting.class
			 */
			break;

		case 7:
			/*
			 * Which line below specifies to the compiler a literal-value having data-type
			 * long?
			 * 
			 * 3F
			 * 
			 * 3L
			 * 
			 * 3
			 * 
			 * 3D
			 */
			long something ;
			break;
		case 8:
			// What will the following print?
			int n = 1;
			
			System.out.printf("%d, %d, %d, %d, %d,", n, --n, n--, n++, ++n);  //1 0 0 -1 1 

			System.out.println(n++); //1
			
			break;
		case 9:
//			Which line of code below correctly declares a variable that is a constant in Java programming?
//
//					const double SALES_TAX = 0.14;
//
//					double SALES_TAX = 0.14;
//
//					final double SALES_TAX = 0.14;
//
//					static double SALES_TAX = 0.14;
				
			break;
		case 10:
			double number = 4.0;
			if (number/4 == 1.0)
				System.out.println(number);
			else
				System.out.println("well isn't this a surprise? " + number);
			break;

		case 11:
			/*
			 * what is a syntax error? what is a logical error? what is a runtime error?
			 * what about compile time?
			 */
			
			/**
			 * What term is used to refer to the computer instructions that are executed by
			 * a CPU?
			 * 
			 * virtual machine 
			 * machine code 
			 * high-level code
			 * instruction set
			 */
			
			/**
			 * what do each of these mean? 
			 * Initializing 
			 * Instance 
			 * Declaration  
			 * Definition 
			 * Attribute 
			 * instance variables
			 * Literals  
			 */
			
			/*
			 * Declaring a class creates the objects.
			 * 
			 * True False
			 */
			
			
			break;
		case 12: 
//			Which one of the following variable declarations and initializations contains a syntax mistake?
//
//
//					char number1 = 65;  
//
//					int number1 = 33.0;
//
//					int number1 = 'A';
//
//					double number1 = 15;
			
//			System.out.println(number1);
			break;

		default:
			System.out.println("Sorry, this option is not implemented yet. ");
			break;
		}
		count++;
		count %= 12;
		writeToFile();
	}

}
