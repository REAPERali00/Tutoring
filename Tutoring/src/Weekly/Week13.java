package Weekly;

import java.util.Arrays;
import java.util.Collections;

public class Week13 {
	
	
	
	public static void friday() {
		new Arrays_13().arrays();
	}
	
	/*
	 * 1. conditional statements : boolean: true || false, if, else if, else. switch cases 
	 * 2. loops: for, while, do while. 
	 * 3. arrays: a bunch of variables right next to each other
	 */
	public static void saturday() {
		Rectangle rec = new Rectangle(12,12);
		new Rectangle().getHeight();
		String str = "Something"; 
		"Something".length();
		System.out.println("TODO".toLowerCase());
		//		rec.setHeight(12);
		System.out.println(rec.getHeight() +" "+ rec.getWidth());
		
		//Prints fizz if i is even, and buzz if i is odd. 
		for(int i = 0; i != 1000 && i >= 0 ; i++){
			System.out.println(i % 2 ==0? "fizz": "buzz");
		}
	}
	
	public static void main(String[] args) {
		saturday();
	}

}

class Arrays_13{
	
	public void arrays() {
		int[] arr = new int[12]; //if you don't know the value
		int[] arr2 = {3,5,4};  //if you konw the exact value
		
		//print the array
		for(int i = 0 ; i < arr2.length; i++)
			System.out.printf("%d %s", arr2[i], i == arr2.length-1? "\n": "");
		
		//reverse print it
		for(int i = arr2.length-1 ; i >= 0 ; i--)
			System.out.printf("%d %s", arr2[i], i == 0 ? "\n": "");
	
		//give each element of the array a value starting from 1, 3, 5, ..., lenght-1.
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = i*2 + 1;
			System.out.printf("%d %s", arr[i], i == arr.length-1? "\n": "");
		}
	}
	
	public void start() {

	}
}
