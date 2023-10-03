package Week3.inheritance;


/*
 * Student Name: 
 * Lab Professor: Professor 
 * Due Date: The due date
 * Description: 
 */

/**
 * This class provides ...
 *
 * @author 
 *
 */
public class Lecture3Test {

	/**
	 * Description: Method that ...
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		Person student = new Student();
		Person professor = new Professor();

		person.listen();
		student.listen();
		professor.listen();
		
		person.sit();
		student.sit();
		professor.sit();
	}

}
