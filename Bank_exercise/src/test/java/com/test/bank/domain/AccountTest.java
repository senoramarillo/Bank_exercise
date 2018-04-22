package com.test.bank.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	private AccountMutable myAccount;
	private final static String ACCNUMBER = "000919832912981";
	private final static int INITIALCREDITLINE = 3000;
	private final static int INITIALBALANCE = 1000;
	private final static int NEGATIVE_AMOUNT = -500;
	private final static int NEGATIVE_AMOUNT_HIGH = -5000;
	private final static int POSITIVE_AMOUNT = 1000;

	@Before
	public void setUp() throws Exception {
		myAccount = new CreditAccount(INITIALBALANCE, ACCNUMBER, INITIALCREDITLINE);
	}

	@After
	public void tearDown() throws Exception {
		myAccount = null;
	}

	@Test
	public void testBookWithPositiveAmount() {
		int expectedNewBalance = INITIALBALANCE + POSITIVE_AMOUNT;
		assertTrue(myAccount.book(POSITIVE_AMOUNT));
		assertEquals("balance value not ok", expectedNewBalance, myAccount.getBalance());
	}

	public void testBookWithDrawAmountNotToHigh() {
		int expectedNewBalance = INITIALBALANCE - NEGATIVE_AMOUNT;
		assertTrue(myAccount.book(NEGATIVE_AMOUNT));
		assertEquals("balance value not ok", expectedNewBalance, myAccount.getBalance());
	}

	public void testBookWithDrawBalanceGetZero() {
		int expectedNewBalance = INITIALBALANCE - INITIALBALANCE;
		assertTrue(myAccount.book(INITIALBALANCE * -1));
		assertEquals("balance value should be zero", expectedNewBalance, myAccount.getBalance());
	}

	public void testWithDrawAmountBalanceGetZero() {
		int expectedNewBalance = INITIALBALANCE;
		assertTrue(myAccount.book(NEGATIVE_AMOUNT_HIGH));
		assertEquals("balance value not ok", expectedNewBalance, myAccount.getBalance());
	}

}
