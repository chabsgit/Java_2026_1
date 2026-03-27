package com.java.leetcode;

import java.util.Arrays;

public class EASY_26_RemoveElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		int k = removeDuplicates(nums);
		
		
		System.out.println(k);
		System.out.print(Arrays.toString(nums));
	}
	
	/**
	 * compare with previous value
	 * if same, current element to be removed - lastValidPlace = 1, repeting num = 0
	 * if not , increment k found unique element, move 1 to lastValidPlace,
	 * @param nums
	 * @return
	 */

	public static int removeDuplicates(int[] nums) {
		if(nums.length == 0)
				return 0;
		
		int k = 1;
		int lastValidPlace = 1;
		for(int i=1; i < nums.length; i++) {
			if(nums[i] != nums[i-1]) {
				k++;
				nums[lastValidPlace] = nums[i];
				lastValidPlace++;
			}
		}
		
		return k;
	}

}
