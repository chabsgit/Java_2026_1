package com.java.leetcode;

public class EASY_1784_CheckBinaryForMaxOneSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkOnesSegment_chatGPTSolution("1001"));
		System.out.println(checkOnesSegment_chatGPTSolution("100"));
		System.out.println(checkOnesSegment_chatGPTSolution("11011"));
		System.out.println(checkOnesSegment_chatGPTSolution("01001001101"));
		System.out.println(checkOnesSegment_chatGPTSolution2("1001"));
		System.out.println(checkOnesSegment_chatGPTSolution2("100"));
		System.out.println(checkOnesSegment_chatGPTSolution2("11011"));
		System.out.println(checkOnesSegment_chatGPTSolution2("101110"));
	}

	
	public static boolean checkOnesSegment_chatGPTSolution(String s) {

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0') {
                return false;
            }

        }

        return true;
    }
	
	
	public static 	 boolean checkOnesSegment_chatGPTSolution2(String s) {
	    return !s.contains("01");
	}

}
