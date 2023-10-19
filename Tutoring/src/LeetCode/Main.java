package LeetCode;

import java.util.Arrays;

public class Main {
	private static Interview solution = new Interview();

	
	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3}; 
		int k = solution.removeDuplicates2(nums);

		System.out.printf("%d \n", k);
		solution.printArr(nums);
	}

}
