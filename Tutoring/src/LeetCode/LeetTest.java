package LeetCode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LeetTest {
	private static Interview solution = new Interview();

	@Test
	public void mergeSortedArrayTest() {
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		int result[] = {1,2,2,3,5, 6};
		solution.merge(nums1, nums1.length-nums2.length, nums2, nums2.length);
		assertArrayEquals("The Results don't match to the expected value",nums1,result);
	}

	@Test
	public void removeElementTest() {
		int nums[] = {0,1,2,2,3,0,4,2}; 
		int result[] = {0,1,4,0,3,2,2,2};
		int k = solution.removeElement1(nums, 2);
		assertEquals(k, 5);
		assertArrayEquals("The Results don't match to the expected value",nums,result);
	}
	
	@Test
	public void removeDuplicatesTest() {
		int nums[] = {0,0,1,1,1,2,2,3,3,4}, result[] = {0,1,2,3,4}; 
		int k = solution.removeDuplicates(nums);
		int res[] = new int[k];
		System.arraycopy(nums, 0, res, 0, k);
		
		assertEquals(k, 5);
		assertArrayEquals("The Results don't match to the expected value",res,result);
	}
}
