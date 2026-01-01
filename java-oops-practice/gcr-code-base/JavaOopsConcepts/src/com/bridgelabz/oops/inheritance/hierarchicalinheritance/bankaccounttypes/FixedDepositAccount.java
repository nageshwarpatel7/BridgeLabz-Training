package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{
	
	public FixedDepositAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public void displayAccountType() {
		System.out.println("Account type: Fixed deposite account");
		super.displayAccountDetails();
	}
}
