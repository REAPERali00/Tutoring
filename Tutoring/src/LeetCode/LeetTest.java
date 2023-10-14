package LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeetTest {
	private static Interview solution = new Interview();

	@Test
	public void mergeSortedArray() {
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		int result[] = {1,2,2,3,5, 6};
		solution.merge(nums1, nums1.length-nums2.length, nums2, nums2.length);
		assertArrayEquals("The Results don't match to the expected value",nums1,result);
	}

}
