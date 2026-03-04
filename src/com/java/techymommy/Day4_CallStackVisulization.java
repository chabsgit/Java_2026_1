package com.java.techymommy;

class parent {
	parent() {
		get();
	}

	 protected void get() {
		System.out.println("Parent get method called");
	}

	public Number add(int a, int b) {
		System.out.println("parent add");
		return a + b;
	}
}

class child extends parent {
	void get() {
		System.out.println("Child get method called");
	}

	public Integer add(int a, int b) {
		System.out.println("child add");
		return (a + b);
	}
}

public class Day4_CallStackVisulization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main called");
		method1();
	}

	public static void method1() {
		System.out.println("method1 called");

		parent p = new parent();
		p.add(5, 5);
		
		parent pc = new child();
		pc.add(10, 0);
		
		child c = new child();
		c.add(20,10);
		c.get();
	}

}
