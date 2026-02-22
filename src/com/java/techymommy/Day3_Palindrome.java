package com.java.techymommy;
//leedcode problem
public class Day3_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromeSingleWord("madam"));
		System.out.println(isPalindromeSingleWord("lol"));
		System.out.println(isPalindromeSingleWord("madaadam"));
		System.out.println(isPalindromeSingleWord("hello"));
		isPalindromeSentence("A man, a plan, a canal: Panama");
		isPalindromeSentence("0P");
		isPalindromeSentence("race a car");
	}
	
	
	/**
	 * madam -- len=5, len/2 = 2 ; counter=3 --> TRUE
	 * madaadam -- len = 8 , len/2 = 4 , counter = 5 --> TRUE
	 * hello -- len = 5, len/2 = 2; counter = 1 --> FALSE
	 * aa -- ;len = 2; len/2=1; counter = 2 -->TRUE
	 * 
	 * @param s
	 */
	public static boolean isPalindromeSingleWord(String s) {
		int counter = 1;
		for(int i = 0 ; i < s.length()/2; i++) {
			if(s.charAt(i)==s.charAt(s.length()-counter)) {
				counter++;
			}
			else 
				return false;
		}
		
		return counter == s.length()/2+1;
	}
	
	public static void isPalindromeSentence(String s) {
		String newStr = s.toLowerCase().replaceAll("[^a-z^0-9]", "");
		System.out.println(newStr + ":" + isPalindromeSingleWord(newStr));
	}

}
