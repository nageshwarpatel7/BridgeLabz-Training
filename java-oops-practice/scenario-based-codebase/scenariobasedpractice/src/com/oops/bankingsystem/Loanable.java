package com.oops.bankingsystem;

public interface Loanable {
	void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
