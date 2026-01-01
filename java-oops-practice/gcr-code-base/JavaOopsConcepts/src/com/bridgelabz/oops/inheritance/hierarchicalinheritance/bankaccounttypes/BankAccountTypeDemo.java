package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccountTypeDemo {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(12033, 10000);
		acc1.displayAccountDetails();
		
		SavingsAccount acc2 = new SavingsAccount(12001, 20000);
		acc2.displayAccountType();
		
		CheckingAccount acc3 = new CheckingAccount(12002, 25000);
		acc3.displayAccountType();
		
		FixedDepositAccount acc4 = new FixedDepositAccount(12003, 30000);
		acc4.displayAccountType();
	}
}
