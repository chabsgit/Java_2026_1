package com.java.day1;

public class BankAccount {
	String accNumber;
	String accHolderName;
	double balance;
	
	public BankAccount(String accNumber, String accHolderName, double balance) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		if(amount > 0) {
			this.balance = this.balance + amount;
			System.out.println("Depoisted " + amount);
		}
	}
	void withdraw(double amount) {
		if(amount > 0 && amount < this.balance) {
			this.balance = this.balance - amount;
			System.out.println("Withdrawn " + amount);

		}
	}
	void printAccountDetails() {
		System.out.println("Account details:" + this.accHolderName + " - " +this.accNumber + " - " + this.balance);
	}
	
	
	static public void main(String[] args) {
		BankAccount b = new BankAccount("AC001", "Aparna", 100000);
		b.deposit(20000);
		b.printAccountDetails();
		b.withdraw(5000);
		b.printAccountDetails();
	}
	
}
