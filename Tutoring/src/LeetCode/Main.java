package LeetCode;

public class Main {
	private static Interview solution = new Interview();
	
	public static void main(String[] args) {
		int nums1[] = {2,0};
		int nums2[] = {1};
		solution.merge(nums1, nums1.length-nums2.length, nums2, nums2.length);
		solution.printArr(nums1);
	}

}
