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
	
	public static void sunday() {
		int arr[] = {1,2,3, 4, 5};
		new Arrays_13().rereverse_arr_int(arr);
		for(int i : arr)
			System.out.printf("%d \t",i);
		
	}
	
	public static void main(String[] args) {
		sunday();
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
	
	/*
	 * get the number, and calculate the reverse of that num. 
	 * ex: 123, returns 321. 
	 */
	public int reverse_int(int num) {//lets say starting num = 123
		int rev = 0; 
		while(num != 0) {
			rev = num % 10 + rev * 10; //reverse = 321
			num /= 10; //num = num / 10; //num = 0 
		}
		return rev; 
	}
	/*
	 * this time we are receiving  an array. 
	 * ex: arr = {1,2,3}. arr = {3,2,1}; 
	 */
	public void rereverse_arr_int(int[] arr) {
		for(int i = 0; i < arr.length/2 ; i++) {
			int temp = arr[i]; 
			arr[i] = arr[arr.length - i-1]; 
			arr[arr.length - i - 1] = temp; 
		}
	}
	
	public void start() {

	}
}
