package Exercise;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Exercise {
	
	private Map<String, Double> exerciseMap = new HashMap<>();
	
	/**
	 * Registers a New Exercise! 
	 * @param name name of the exercise, will not accept null value
	 * @param calory how many calories does the said exercise burn, will not accept zero
	 */
	public void registery(String name, double calory) {
		if(name != null || calory != 0)
			exerciseMap.put(name.toLowerCase(), calory);
	}
	
	/**
	 * Reads multiple entries from the user
	 * @param scan
	 */
	public void registery(Scanner scan) {
		String done = "n", name;
		double calory = 0; 
		do {
			try {
				
				System.out.println("Enter the name of the exercise:");
				name = scan.next();
				System.out.println("How many Cal/Hour does it burn? ");
				calory = scan.nextDouble();
				System.out.println("Do you want to continue? (y/n)");
				done = scan.next();
				exerciseMap.put(name, calory);
				
			}catch(InputMismatchException e) {
				System.out.println("Wrong input type.");
				scan.next();
			}
		}while(done.toLowerCase().equals("y"));
	}
	
	/**
	 * Calculate the total number of burnt calories, searches the map for the exercise. if not found, print error msg
	 * @param name
	 * @param hours
	 * @return
	 */
	public double calcCalories(String name, double hours) {
		name = name.toLowerCase();
		if (exerciseMap.containsKey(name)) {
			return exerciseMap.get(name) * hours;
		} else {
			System.out.println("Exercise is not currently registered.");
		}
		return -1;
	}

	/**
	 * Ask stuff from user, and print calories burnt. its the communicating interface basically. 
	 * @param scan
	 */
	public void inquiry(Scanner scan) {
		try {
			
			String name, choice = "n"; 
			double hours = 0; 
			System.out.println("Enter the name of the Excersize: ");
			name = scan.next(); 
			System.out.println("How many hours did you work out?");
			hours = scan.nextDouble();
			
			double totCal = calcCalories(name, hours);
			if(totCal != -1) {
				System.out.printf("You burned a total of %.2f Calories! \n", totCal);
			}
			
			System.out.println("Do you want to continue? (y/n)");
			choice = scan.next();
			if(choice.toLowerCase().equals("y"))
				inquiry(scan);
			
		}catch(InputMismatchException e) {
			System.out.println("Wrong input type.");
			scan.next();
			inquiry(scan);
		}
	}
	
}
