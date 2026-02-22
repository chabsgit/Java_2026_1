package com.java.leetcode;

import java.util.Stack;
import java.util.HashMap;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validParentheses("()[]{}"));
		System.out.println(validParentheses("([])"));
		System.out.println(validParentheses("([)]"));
		System.out.println(validParentheses("(}"));
		System.out.println(validParentheses("("));
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
		
		HashMap<Character,Character> map = new HashMap<>();
		
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		for(char ch: str.toCharArray()) {
			
			if(!stack.isEmpty() && map.containsKey(stack.peek()) && ch == map.get(stack.peek()))
				stack.pop();
			else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
		
	}

}
