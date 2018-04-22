package com.test.bank.domain;

public class CreditAccount extends Account {
	private int creditLine;

	public CreditAccount(int balance, int creditLine) {
		super(balance);
		this.creditLine = creditLine;
	}
	
	public CreditAccount(int balance, String accountNumber, int creditLine) {
		super(balance, accountNumber);
		this.creditLine = creditLine;
	}

	/**
	 * @param creditLine
	 *            the creditLine to set
	 */
	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}

	/**
	 * @return the creditLine
	 */
	public int getCreditLine() {
		return creditLine;
	}

	@Override
	public boolean book(int amount) {
		if (balance + amount + creditLine >= 0) {
			balance += amount;
			return true;
		} else
			return false;
	}
	
}
