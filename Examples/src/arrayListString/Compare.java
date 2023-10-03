package arrayListString;
/*
 * Student Name: 
 * Lab Professor: Professor 
 * Due Date: The due date
 * Description: 
 */

/**
 * This class provides ...
 *
 * @author rosenbh
 *
 */
public class Compare {

	/**
	 * Description: Method that ...
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListVersion version1 = new ArrayListVersion();
		ArrayVersion version2 = new ArrayVersion();

		System.out.println("Create and Add");
		version1.createAndAdd();
		version2.createAndAdd();
		System.out.println("ArrayList Version: " + version1.toString());
		System.out.println("Array Version: "+ version2.toString());
		System.out.println(version1.toString().equals(version2.toString()));

		System.out.println("\nInsert in first position");
		version1.insertInFirstPosition();
		version2.insertInFirstPosition();
		System.out.println("ArrayList Version(after): " + version1.toString());
		System.out.println("Array Version(after) : "+ version2.toString());
		System.out.println(version1.toString().equals(version2.toString()));

	}

}
