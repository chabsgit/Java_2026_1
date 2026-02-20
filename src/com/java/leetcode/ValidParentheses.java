package com.java.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validParentheses("()[]{}"));
		System.out.println(validParentheses("([])"));
		System.out.println(validParentheses("([)]"));
		System.out.println(validParentheses("(}"));
		System.out.println(validParentheses("(){}(())"));
	}
	
	/**
	 * stack (
	 * 
	 * ()[]{}
	 * if opening bracket , put it on stack
	 * else check top element ofstack is closing bracket if yes pop n continue, else return false
	 * ([])
	 * @param str
	 * @return
	 */
	public static boolean validParentheses(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch: str.toCharArray()) {
			if(ch == '{' || ch == '(' || ch == '[')
				stack.push(ch);
			else {
				char ch1 = stack.peek();
				if((ch == ')' && ch1 == '(')||(ch == ']' && ch1 == '[')||(ch == '}' && ch1 == '{')) {
					stack.pop();
				}
				else
					return false;
			}
				
		}
		
		return true;
	}

}
