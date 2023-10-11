package LeetCode;

import java.util.Arrays;

public class Interview {
	public void printArr(int[] arr) {
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
	}
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		if(nums2.length == 0)
			return;
        int res[] = new int[m+n];
        int i =0, j = 0, k = 0; 
        
        while(i < m+n && j < n && k < m+n){
            res[k++] = (nums1[i] <= nums2[j] && nums1[i]!= 0)? nums1[i++]: nums2[j++]; 
            if(j == n)
               for(; i < m; i++)
            	   res[k++] = nums1[i];
        }
        
        
        System.arraycopy(res, 0, nums1, 0, res.length);
		
    }

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if(nums2.length == 0)
			return;
        for(int num: nums2)
        	nums1[m++] =num; 
        Arrays.sort(nums1);
     
    }
}
