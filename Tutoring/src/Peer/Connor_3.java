package Peer;

import java.util.ArrayList;
import java.util.Arrays;

interface Iface {
	void menu(); 
}

class Sample implements Iface{
	public int n = 3;
	public void menu() {
		smt();
		System.out.println("B");
	}
	public void smt() {
		System.out.println("smt");
	}
	public String toString() {
		return String.format("sample 1");
	}
}

class Sample2 implements Iface{
	public int n = 0;

	public void menu() {
		System.out.println("C");
	}
	
	public String toString() {
		return String.format("sample 2");
	}
	
} 


public class Connor_3 implements Starting {

	@Override
	public void start() {
		Iface arr[] = {new Sample(), new Sample2()};
		ArrayList<Iface> arr2 = new ArrayList<>(Arrays.asList(arr));
		arr2.add(new Sample2()); 
		for(Iface element: arr2)System.out.println(element); 
	
	}

}
