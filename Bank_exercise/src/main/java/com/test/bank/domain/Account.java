package com.test.bank.domain;

public abstract class Account implements AccountMutable {
	protected int balance;
	protected String accountNumber;
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public Account(int balance, String accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public abstract boolean book(int amount);

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
	
}