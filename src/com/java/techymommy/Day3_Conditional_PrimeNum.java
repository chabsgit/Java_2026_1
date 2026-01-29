package com.java.techymommy;

public class Day3_Conditional_PrimeNum {

	/**
	 * Prime num: num/num=0 num/1=0 num/othernum!= 0
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 17;
		int i = 2;
		for (; i <= num; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (num == i) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a prime");
		}
		System.out.println(i);
	}

}
