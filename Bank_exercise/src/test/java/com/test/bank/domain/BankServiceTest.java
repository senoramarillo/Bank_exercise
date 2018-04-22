package com.test.bank.domain;

import static org.junit.Assert.*;

import java.awt.print.Book;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.bank.service.BankService;
import com.test.bank.service.BookingFailedException;

public class BankServiceTest {
	private AccountMutable fromAccount;
	private AccountMutable toAccount;
	private BankService bankService;
	private final static String ACCNUMBER = "000919832912981";
	private final static int INITIALCREDITLINE = 3000;
	private final static int INITIALBALANCE = 1000;
	private final static int NEGATIVE_AMOUNT = -500;
	private final static int NEGATIVE_AMOUNT_HIGH = -5000;
	private final static int POSITIVE_AMOUNT = 10000000;

	@Before
	public void setUp() throws Exception {
		fromAccount = new SavingAccount(INITIALBALANCE, ACCNUMBER);
		toAccount = new CreditAccount(INITIALBALANCE, ACCNUMBER, INITIALCREDITLINE);
		bankService = new BankService();
	}

	@After
	public void tearDown() throws Exception {
		fromAccount = null;
		toAccount = null;
		bankService = null;
	}

	@Test(expected = BookingFailedException.class)
	public void testAccountNumber() throws BookingFailedException {
		bankService.transfer(fromAccount, toAccount, POSITIVE_AMOUNT);
	}

}
