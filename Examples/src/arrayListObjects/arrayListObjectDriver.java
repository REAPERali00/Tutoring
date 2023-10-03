package arrayListObjects;

import java.util.ArrayList;
import java.util.List;

public class arrayListObjectDriver {

	private static List<Person> persons = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person (101, "Robert");
		Person person2 = new Person (102, "Richard");
		persons.add(person1);
		persons.add(person2);
		
		String desc;
		System.out.println("Displaying the person information from persons Arraylist");
		for(Person s : persons) {			
			//desc = s.toString();			
			System.out.println(s);
		}

	}

}
