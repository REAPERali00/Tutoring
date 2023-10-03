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
 *
 *
 */
public class Student extends Person {
	private int gpa;
	private long studId;
	
	public double doLab(int labNumber)
	{
		System.out.println("Student:doLab "+labNumber);
		return 10;
	}
	
	public void listen()
	{
		System.out.println("Student:listen "+name);
	}

}
