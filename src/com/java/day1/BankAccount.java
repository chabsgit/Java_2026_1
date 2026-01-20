package com.java.day1;

import com.java.day1.exception.InsufficientBalanceException;
import com.java.day1.exception.InvalidAmountException;

/**
 * BankAccount class to manage bank account
 */
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

	void deposit(double amount) throws InvalidAmountException {
		if (amount < 0)
			throw new InvalidAmountException("Invalid amount:" + amount);
		this.balance = this.balance + amount;
		System.out.println("Depoisted " + amount);

	}

	void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
		if (amount < 0)
			throw new InvalidAmountException("Invalid amount:" + amount);
		if (amount > this.balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		this.balance = this.balance - amount;
		System.out.println("Withdrawn " + amount);
	}

	void printAccountDetails() {
		System.out.println("Account details:" + this.accHolderName + " - " + this.accNumber + " - " + this.balance);
	}

	static public void main(String[] args) throws InvalidAmountException, InsufficientBalanceException {
		BankAccount b = new BankAccount("AC001", "Aparna", 10000);
		b.deposit(20000);
		b.printAccountDetails();
		b.withdraw(5000);
		b.printAccountDetails();
		
		//b.deposit(-3);
		b.withdraw(500000000);
	}

}
