package com.java.techymommy;

import java.io.IOException;

public class Day3_JavaMEthodSignature {

	void method(int a) {
		System.out.println("int");
	}

	void method(long a) {
		System.out.println("long");
	}

//    void method(Integer a) {
//        System.out.println("Integer");
//    }

	void method(int... a) {
		System.out.println("varargs");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3_JavaMEthodSignature t = new Day3_JavaMEthodSignature();
		t.method(10);
		t.method(null); // Gives compilation error when null is passed this call become eligible for 2
						// overloaded method Interger and vatargs one4
		// if removed one of the method, it works fine

		// commented varargs, above call works fine

		Parent p = new Child();
		Parent p1 = new Parent();
		Child p2 = new Child();
		
		 
		
		try {
			p.show();
			p1.show();
			p2.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Parent {
	void show() throws Exception {
		System.out.println("parent");
	}
	
	Number getValue() { return 10; }
	
//compi - duplicate method
//	int add(int a, int b) { return a+b; }
//	 long add(int a, int b) {	 return a+b; }
}

class Child extends Parent {
	void show() throws IOException {
		System.out.println("child");
	}
	Integer getValue() { return 20; }
}
