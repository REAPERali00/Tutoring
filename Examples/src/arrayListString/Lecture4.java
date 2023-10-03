package arrayListString;
/*
 * Student Name: 
 * Lab Professor: 
 * Due Date: The due date
 * Description: 
 */

/**
 * This class provides ...
 *
 * @author 
 *
 */
public class Lecture4 {
	/**
	 * Description: Method that ...
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListVersion version = new ArrayListVersion();

		System.out.println("Create and Add");
		version.createAndAdd();
		version.printNames();

		System.out.println("\nInsert in first position");
		version.insertInFirstPosition();
		version.printNames();
		
		String concatenatedString = version.toString();
		System.out.println("\n Printing the concatenated string\n" + concatenatedString );

	}

}
