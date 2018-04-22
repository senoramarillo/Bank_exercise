package com.test.bank.domain;

public interface AccountMutable extends AccountReadable {
	
	boolean book(int amount);

}
