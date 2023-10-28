package LeetCode;

import java.util.Arrays;

public class Interview {
	public void printArr(int[] arr) {
		for (int i : arr)
			System.out.print(i + ",");
		System.out.println();
	}

	public void swap(int[] arr, int element1, int element2) {
		int temp = arr[element1];
		arr[element1] = arr[element2];
		arr[element2] = temp;
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


	/*
	 * Given an integer array nums and an integer val, remove all occurrences of val
	 * in nums in-place. The order of the elements may be changed. Then return the
	 * number of elements in nums which are not equal to val.
	 * 
	 * Consider the number of elements in nums which are not equal to val be k, to
	 * get accepted, you need to do the following things:
	 * 
	 * Change the array nums such that the first k elements of nums contain the
	 * elements which are not equal to val. The remaining elements of nums are not
	 * important as well as the size of nums. Return k.
	 */
	//My Way: 
	public int removeElement1(int[] nums, int val) {
		int end = nums.length-1, k = nums.length;
		for(int i = 0; i < nums.length  && i <= end; i++){
			while(end >= 0 && nums[end] == val) {
				end--;
				k--; 
			}
			if(nums[i] == val && i < end){
				int temp = nums[i]; 
				nums[i] = nums[end]; 
				nums[end] = temp;
				end--; 
				k--;
			}
		}

		return k;
	}

	//Solution: 
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
		return i;
	}

	public int removeDuplicatesMine(int[] nums) {
		int end = nums.length-1, val;
		int i;
		for(i = 0 ; i < end; i++) {
			val = nums[i]; 
			for(int j = i+1; j < end; j++) {
				if(nums[j] == val) {
					swap(nums, j, end--);
				}
			}
		}
		if(end == nums.length -1)
			return 0; 
		Arrays.sort(nums, 0, nums.length - end);
		return nums.length - i;
	}

	int removeDuplicates(int[] nums) {
		int j = 1;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] != nums[i - 1]){
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	/**
	 * Given an integer array nums sorted in non-decreasing order, remove some
	 * duplicates in-place such that each unique element appears at most twice. The
	 * relative order of the elements should be kept the same.
	 * 
	 * Since it is impossible to change the length of the array in some languages,
	 * you must instead have the result be placed in the first part of the array
	 * nums. More formally, if there are k elements after removing the duplicates,
	 * then the first k elements of nums should hold the final result. It does not
	 * matter what you leave beyond the first k elements.
	 * 
	 * Return k after placing the final result in the first k slots of nums.
	 * 
	 * Do not allocate extra space for another array. You must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates2(int[] nums) {
		int j = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] != nums[j - 2]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	/*
	 * Given an array nums of size n, return the majority element.
	 * 
	 * The majority element is the element that appears more than [n / 2] times. You
	 * may assume that the majority element always exists in the array.
	 */
	public int majorityElementFirstAttempt(int[] nums) {
		int count = 0, current = nums[0]; 
		for(int i = 0; i < nums.length; i++){
			current = nums[i]; 
			for(int j = 0; j < nums.length; j++){
				if(nums[j] == nums[i])
					count++; 
			}
			if(count > nums.length/ 2)
				return current; 
			count = 0; 
		}
		return current ; 
	}

	public int majorityElement(int[] nums) {
		int count = 0,candidate = 0 ;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count = (num == candidate) ? count+1: count-1; 
		}
		return candidate; 
	}

	public void rotate(int[] nums, int k) {
		for (int i = 0; i < k; i++)
			swap(nums, i, nums.length - k);
	}	

	public int findSmallest(int[] arr){
		int  minInd = 0; 
		for(int i = 0; i < arr.length; i++) 
			if(arr[i] < arr[minInd]) minInd = i; 
		return minInd;
	}

	public int maxProfitMyFirstSolution(int[] prices) {
		int minInd = findSmallest(prices), max = 0; 
		for(int i = minInd+ 1; i < prices.length; i++)
			if(prices[i] > max) max = prices[i];
		if(minInd == prices.length-1) return 0;  
		return max - prices[minInd]; 

	}

	public int maxProfit(int[] prices) {
		int cheapest = prices[0], maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < cheapest)
				cheapest = prices[i];
			else if ((prices[i] - cheapest) > maxProfit)
				maxProfit = prices[i] - cheapest;
		}
		return maxProfit;
	}

	/*
	 * You are given an integer array prices where prices[i] is the price of a given
	 * stock on the ith day.
	 * 
	 * On each day, you may decide to buy and/or sell the stock. You can only hold
	 * at most one share of the stock at any time. However, you can buy it then
	 * immediately sell it on the same day.
	 * 
	 * Find and return the maximum profit you can achieve.
	 */
	public int maxProfit2(int[] prices) {
		int cheapest = prices[0], maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < cheapest)
				cheapest = prices[i];
			else if ((prices[i] - cheapest) > 0) {
				maxProfit += prices[i] - cheapest;
				cheapest = prices[i];
			}
		}
		return maxProfit;
	}

	public boolean canJumpMySolution(int[] nums) {
        int length = nums.length;
        for(int i = 0; nums[i%length] != 0;){
            i += nums[i]; 
            if(i >= length-1) return true; 
        }
        if(length==1) return true;
        return false;
    }
	
    public boolean canJump(int[] nums) {
        int max = 0; 
        for(int i = 0; i< nums.length; i++){
            if(i > max) return false; 
            max = Math.max(max, i+nums[i]); 
        }
        return true;
     }

    public int jump2Solution(int[] nums) {
		for(int i = 1; i < nums.length; i++) 
			nums[i] = Math.max(nums[i] + i, nums[i-1]);
		int count= 0; 
		for(int i = 0; i < nums.length-1;){
			count++; 
			i = nums[i]; 
		}
		return count;  
	}
    
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length, res = 0;  
        for(int i = 0; i < n - res; i++)
            if(citations[i] != res)
                res = Math.max(res, Math.min(citations[i], n-i));
        return res;
    }
    
    public int[] productExceptSelfMySolution(int[] nums) {
        int length = nums.length;
        int res[] = new int[length]; 
        Arrays.fill(res, 1); 
        for(int i =0 , j = 0; j < length;i++) {
            if(i >= length){
                i%= length; 
                j++;
            } 
            if(i!= j)
                res[i] *= nums[j];
        }
        return res; 
    }
    
	public int[] productExceptSelf(int[] nums) {
		int length = nums.length;
		int[] res = new int[length];

		// Initialize res with the product of all elements to the left of i
		int leftProduct = 1;
		for (int i = 0; i < length; i++) {
			res[i] = leftProduct;
			leftProduct *= nums[i];
		}

		// Initialize a variable to store the product of all elements to the right of i
		int rightProduct = 1;

		// Update res by multiplying it with the product of all elements to the right of
		// i
		for (int i = length - 1; i >= 0; i--) {
			res[i] *= rightProduct;
			rightProduct *= nums[i];
		}

		return res;
	}
    
    
    
    
    
    
    
}
