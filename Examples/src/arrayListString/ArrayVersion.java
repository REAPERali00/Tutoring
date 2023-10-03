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
public class ArrayVersion {
	private String[] studentNames;
	private int currentPosition = 0;

	public void createAndAdd()
	{
		studentNames = new String[100];
		studentNames[currentPosition++]="Peter";
		studentNames[currentPosition++]="Pauline";
		studentNames[currentPosition++]="Robin";
	}

	public void insertInFirstPosition()
	{
		for(int i=currentPosition; i>0; i--)
			studentNames[i]=studentNames[i-1];
		studentNames[0]="Howard";
		currentPosition++;
	}

	public void printNames()
	{
		for(int i=0; i<currentPosition; i++)
			System.out.println(studentNames[i]);
	}

	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<currentPosition; i++)
			sb.append(studentNames[i]);
		return sb.toString();
	}


}
