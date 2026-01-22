package com.java.techymommy;

class Book{
	String name;
	int price;
	public Book(String name, int price) {
		this.name= name;
		this.price = price;
	}
	
	public void printBookDetails() {
		System.out.println("Book Name:" + this.name + " Price:" + this.price);
	}
}

public class Day1_MemoryAllocationBehaviorInJava {

	
	
	static public void main(String args[]) {
		
		//primitive
		int num = 5;
		System.out.println(num);
		method1(num);
		System.out.println(num);
		
		
		//object behavior
		Book b = new Book("The secret", 200);
		b.printBookDetails();
		method2(b);
		b.printBookDetails();
		
		method3(b);
		b.printBookDetails();

	}
	
	static void method1(int n) {
		++n;
		System.out.println(n);
	}
	
	static void method2(Book b) {
		b.name = "The secret 2";
		b.price = 100;
		b.printBookDetails();
	}
	
	static void method3(Book b) {
		b = new Book("Method3", 100);
		b.printBookDetails();
	}
}
