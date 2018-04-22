package com.test.bank.domain;

public class SavingAccount extends Account {

	public SavingAccount(int balance, String accountNumber) {
		super(balance, accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean book(int amount) {
		if (balance + amount >= 0) {
			balance += amount;
			return true;
		} else
			return false;
	}
}