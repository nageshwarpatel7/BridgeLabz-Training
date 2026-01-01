package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
	public int accountNumber;
	public double balance;
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber =accountNumber;
		this.balance = balance;
	}
	public void displayAccountDetails() {
		System.out.println("Account number: "+accountNumber);
		System.out.println("Balance: "+balance+"\n");
	}
}
