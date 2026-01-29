package com.java.techymommy;

public class Day2_ConditionalStructureLogical_ReverseNum {

	/**
	 * 123/10=12 123%10= 3 | 12/10=1 12%10=2 | 1/10=0 1%10=1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 123;
		int temp = num;
		int r = 0;
		while (temp > 0) {
			r = temp % 10;
			System.out.print(r);
			temp = temp / 10;
		}

	}

}
