package Peer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import test.DecisionStructures;

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
		//		String res = arr.toString();
		//		System.out.println(res);
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
	public static void print2(ArrayList arr){
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) +" " );

		}
	}
	public static void main(String[] args) {
		//Array list practice: Make a game! 
		DecisionStructures desc = new DecisionStructures();	
		RPS rps = new RPS();
		rps.start();
	}


}
class RPS{
	private ArrayList<String> choices = new ArrayList<>(Arrays.asList("paper", "rock", "scissor")); 
	public void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your move: ");
		game(scan.next());
		start();
	}
	public void game(String player) {
		if(!choices.contains(player)) {
			System.out.println("Sorry, wrong input!");
			return;
		}
		System.out.println("Player: " + player);
		int cInd = (int) (Math.random() * 3);

		System.out.println("Computer: " + choices.get(cInd));
		int result = cInd - choices.indexOf(player);

		if(result == -1 || (result == 2)) {
			System.out.println("Winner: Computer");
		}
		else if(result == 0) {
			System.out.println("Winner: Tie");
		}
		else
			System.out.println("Winer: player");
	}
}
