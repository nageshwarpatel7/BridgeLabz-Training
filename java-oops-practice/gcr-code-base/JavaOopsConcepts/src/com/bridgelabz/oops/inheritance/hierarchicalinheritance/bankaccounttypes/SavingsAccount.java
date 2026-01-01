package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {
		
	public SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public void displayAccountType() {
		System.out.println("Account type: Savings account");
		super.displayAccountDetails();
	}
}
