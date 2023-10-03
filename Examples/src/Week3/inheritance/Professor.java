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
 * @author rosenbh
 *
 */
public class Professor extends Person {
	private int yearsOfEmp;
	private long empId;
	
	public double gradeLab(int labNumber)
	{
		System.out.println("Professor:gradeLab "+labNumber);
		return 10;		
	}
}
