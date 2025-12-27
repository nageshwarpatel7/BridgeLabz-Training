package com.constructorInstance.level1;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(int accNo, String accountHolder, double balance) {
		super(accNo,accountHolder, balance);
	}
	public static void main(String[] args) {
		SavingsAccount acc = new SavingsAccount(17172, "Nageshwar", 50000);
		System.out.println("Account Holder: "+acc.accountHolder);
		System.out.println("Account number: "+acc.accountNumber);
		acc.getBalance();
		acc.setBalance(1000);
		acc.getBalance();
	}
}
