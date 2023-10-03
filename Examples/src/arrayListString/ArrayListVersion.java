package arrayListString;
import java.util.ArrayList;
import java.util.List;

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
public class ArrayListVersion {
	private ArrayList<String> studentNames;

	public void createAndAdd()
	{
		
		studentNames = new ArrayList<>();
		System.out.println("The size of the ArrayList is:After declaration " + studentNames.size());		
		studentNames.add("Peter");
		studentNames.add("Pauline");
		studentNames.add("Robin");
		System.out.println("The size of the ArrayList is:After adding elements " + studentNames.size());
	}

	public void insertInFirstPosition()
	{
		studentNames.add(1, "Howard");
	}

	public void printNames()
	{
		for(String s : studentNames)
			System.out.println(s);
	}

	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		for(String s : studentNames)
			sb.append(s);
		return sb.toString();
	}
}
