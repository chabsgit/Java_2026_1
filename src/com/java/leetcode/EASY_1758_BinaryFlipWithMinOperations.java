package com.java.leetcode;

/**
 * https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/?envType=daily-question&envId=2026-03-05
 * You are given a string s consisting only of the characters '0' and '1'. In
 * one operation, you can change any '0' to '1' or vice versa.
 * 
 * The string is called alternating if no two adjacent characters are equal. For
 * example, the string "010" is alternating, while the string "0100" is not.
 * 
 * Return the minimum number of operations needed to make s alternating.
 */
public class EASY_1758_BinaryFlipWithMinOperations {

	public static void main(String[] args) {
		System.out.println(minOperations("111000"));
		System.out.println(minOperations("010"));
		System.out.println(minOperations("10"));
		System.out.println(minOperations("10010100"));
		System.out.println(minOperations("01001001101"));
	}

	public static int minOperations(String s) {
		char exCh = '1';// based on 1st charof string
		char exCh2 = '0'; // make first char 0 and check
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != exCh)
				count++;

			exCh = exCh == '1' ? '0' : '1';

			// need to start from first bit
			if (s.charAt(i) != exCh2)
				count2++;

			exCh2 = exCh2 == '1' ? '0' : '1';

		}

		return Math.min(count, count2);
	}

}
