package com.java.leetcode;

import java.util.Arrays;

public class EASY_27_Remove_Element {

	public static void main(String[] args) {
		int [] nums = {1};
		/**
		 * nums[i]==2 and nums[rp] != val - swap rp-- 
		 * 			i =  0 
		 * 			rp = 7 
		 *       --- 
		 */
		
		int val = 1;
		int k = removeElement1(nums,val);
		System.out.println(k);
		System.out.println(Arrays.toString(nums));
	}

	 	public static int removeElement(int[] nums, int val) {
	        int k = 0;
	        
	        for(int i=0; i < nums.length ; i++) {
	        	if(nums[i] == val) {
	        		nums[i] = 100;
	        		k++;
	        	}
	        }
	        return nums.length-k;
	    }
	 	
	 	public static int removeElement1(int[] nums, int val) {
	 		if(nums.length == 1 && nums[0] == val)
	 			return 1;
	        int k = 0;
	        int rp = nums.length - 1;
	        for(int i=0; i < nums.length ; i++) {
	        	
	        	if(nums[i] == val) {
	        		if(nums[rp] == val) {
		        		rp--;
		        		k++;
		        	}
	        		nums[i] = nums[rp];
	        		nums[rp] = val;
	        		rp--;
	        		k++;
	        	}
	        	if(i>=rp)
	        		break;
	        }
	        return nums.length-k;
	    }
}
