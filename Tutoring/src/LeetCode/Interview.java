package LeetCode;

import java.util.Arrays;

public class Interview {
	public void printArr(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		if (nums2.length == 0)
			return;
		int res[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m + n && j < n && k < m + n) {
			res[k++] = (nums1[i] <= nums2[j] && nums1[i] != 0) ? nums1[i++] : nums2[j++];
			if (j == n)
				for (; i < m; i++)
					res[k++] = nums1[i];
		}

		System.arraycopy(res, 0, nums1, 0, res.length);

	}

	/**
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
	 * order, and two integers m and n, representing the number of elements in nums1
	 * and nums2 respectively.
	 * 
	 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	 * 
	 * The final sorted array should not be returned by the function, but instead be
	 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
	 * n, where the first m elements denote the elements that should be merged, and
	 * the last n elements are set to 0 and should be ignored. nums2 has a length of
	 * n.
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums2.length == 0)
			return;
		for (int num : nums2)
			nums1[m++] = num;
		Arrays.sort(nums1);

	}

	public int removeElement(int[] nums, int val) {
		
		return -1;
	}
	
	
	
}
