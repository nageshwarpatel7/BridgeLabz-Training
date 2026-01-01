package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(int accountNumber, double balance) {
		super(accountNumber, balance);		
	}
	
	public void displayAccountType() {
		System.out.println("Account type: Checking account");
		super.displayAccountDetails();
	}
}
