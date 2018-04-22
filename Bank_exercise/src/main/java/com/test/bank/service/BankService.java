package com.test.bank.service;

import com.test.bank.domain.AccountMutable;

public class BankService {

	public void transfer(AccountMutable fromAccount, AccountMutable toAccount, int amount) throws BookingFailedException {
		if(toAccount.book(-amount)) {
			toAccount.book(amount);
		}
		else
			throw new BookingFailedException("Booking failed because of high transfer amount");
	}

}
