package com.java.leetcode;
//leedcode problem
public class EASY_9_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPalindromeSingleWord("madam"));
//		System.out.println(isPalindromeSingleWord("lol"));
//		System.out.println(isPalindromeSingleWord("madaadam"));
//		System.out.println(isPalindromeSingleWord("hello"));
//		isPalindromeSentence("A man, a plan, a canal: Panama");
//		isPalindromeSentence("0P");
//		isPalindromeSentence("race a car");
		
		isPalindromeNumber(123);
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
	
	/**
	 * 
	 * 
	 * 123 --- 123/10=12  123%10=3 reverse = 0 * 10 + 3 = 3
	 * 			12/10=1 12%10=2 reverse = 3 * 10 + 2 = 32
	 * 			1/10=0  1%10=1  reverse = 32 * 10 + 1 = 321
	 * 			
	 * 			1*100+2*10+1*1=100+20+1
	 * 
	 * 
	 * 3 2 1 == 3*100+2*10+1= 300+20+1
	 * 3 2 1 == 3 --> (30+2) --> (320+1) = 
	 * 
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPalindromeNumber(int x) {
		if(x < 0)
			return false;
		
		int temp = x;
		int remainder = 0;
		int reverse = 0;
		while(temp > 0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp/10;
		}
		
		return x==reverse;
	}

}
