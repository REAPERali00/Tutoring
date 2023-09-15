package test;

public class Arrays {
	
	public void printArr(int[] arr) {
		for(int i : arr)
			System.out.println(i);
	}
	
	public void reverse(int[] arr) {
		
		int[]reverse = new int[arr.length];
		for(int i = arr.length -1, j = 0; i >=0 ; i--, j++) {
			reverse[j] = arr[i];
		}
		printArr(reverse);
	}
}
