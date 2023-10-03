package Peer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
 
class Dynamic{
	int[] arr = new int[10]; 
	int size = 0; 
	public void addLast(int n) {
		if(size != arr.length) {
			arr[size++] = n;
		}
	}
	public void readValue() {
		for(int i = 0; i < size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

class A{
	A(int n){
		System.out.println("A" + n);
	}
	
	public void print() {
		System.out.println("hello world");
	}
}
class B extends A{
	B(){
		super(10);
		System.out.println("B");
		super.print();
	}
}
public class Conor {
	
	public static void printArr(ArrayList arr) {
		for(Object i : arr)
			System.out.println(i);
	}
	
	public static void basics() {
		ArrayList<Double> arr = new ArrayList<Double>();
		
		arr.add(1.0);
		//arr.set(1,1);
		printArr(arr);
	}
	
	public static void iteratorExample() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
		    Integer number = iterator.next();
		    System.out.println(number);
		}

	}
	
	public static void arrayToList(){
		String[] arr = {"Apple", "Banana"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		printArr(list);
	}
	
	public static void main(String[] args) {
		arrayToList();	

	}

}
