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
public class Person {
	protected String name;
	protected int age;
	protected float height;
	
	public void sit()
	{
		System.out.println("Person:sit");
	}

	public void stand()
	{
		System.out.println("Person:stand");
	}

	public void listen()
	{
		System.out.println("Person:listen");
	}
	
	public String see()
	{
		System.out.println("Person:see");
		return "Something";
	}
	
}
