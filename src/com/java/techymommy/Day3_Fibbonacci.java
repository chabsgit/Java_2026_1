package com.java.techymommy;

public class Day3_Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFibbonacci(4);
	}
	
	/**
	 * 5 -> 1,1,2,3,5
	 * @param n
	 */
	public static void printFibbonacci(int n) {
		if(n >= 1)
			System.out.print(0 + " ");
		
		if(n >= 2)
			System.out.print(1 + " ");
		
		int n1 = 0;
		int n2 = 1;
		int counter = 2;
		while(counter < n) {
			int temp = n1+n2;
			System.out.print(temp+" ");
			n1 = n2;
			n2 = temp;
			counter++;
		}
		
	}

}
