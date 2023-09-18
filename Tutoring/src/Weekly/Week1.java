package Weekly;
import java.util.Scanner;

import Exercise.Exercise;

public class Week1 {

	/**
	 * Things we will go through Each Session:
	 * 1. Questions at the beginning of each Session
	 * 2. If we have time, I will usually go through something extra
	 * 3. Saturdays are fun days! we will go through Projects and make things
	 * together!
	 * 
	 * For the first session: 1. we will go through Basics on how to set up a basic
	 * Java program (Hello world)
	 * 2. Saturday Project! Make an application that asks the user their work out
	 * type and hours of exercise,
	 * and tells them How many calories they burned!
	 * 3. Topics covered: variables, printing, and Scanner (reading input from
	 * user).
	 */

	public static void main(String[] args) {
		Exercise exc = new Exercise();
		Scanner scan = new Scanner(System.in);
		//Declarations: 
		String name; 
		double calPerHour ; 
		double hours; 
	
		//Register the exercise: 
		exc.registery("Running", 250);
		exc.registery("Walking", 120);
		exc.registery("Swimming", 200);
		
		//Reading Inputs from user
		System.out.println("What exercise did you do? ");
		name = scan.nextLine();
		System.out.println("How many hours did you work out?");
		hours = scan.nextDouble();
		double totCal = exc.calcCalories(name, hours); 
		if(totCal != -1) {
			System.out.println("You burnt " + totCal+ " ammount of calories!");
		}
	}







}
