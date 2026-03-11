package com.java.leetcode;

import java.util.HashMap;

public class EASY_1_Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(twoSum(new int[] {2,7,11,15}, 9));
		System.out.println(twoSum(new int[] {3,2,4}, 6));

	}
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        /**
         * 2,7,11,15 Target=9
            2 = 7 ---> 2 --> 7 - 0 
            7 = 2 -->  return map.get(7) & index of 7 1 - STOP
            11 = -2
			15 = -6
			
			3,2,4 Target=6
			3 --> 3 -- 0
			2 --> 4 -- 1
			4 --> 
        
         */
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
            	System.out.println(map.get(nums[i]) + "," + i);
                return new int[]{map.get(nums[i]),i};
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        
        return null;
    }

}
