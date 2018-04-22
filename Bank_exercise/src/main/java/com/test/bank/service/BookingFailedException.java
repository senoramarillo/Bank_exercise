package com.test.bank.service;

public class BookingFailedException extends Exception {

	public BookingFailedException(String message) {
		super(message);
		System.out.println("Booking failed: " + message);
	}

	public BookingFailedException(String message, Throwable cause) {
		super(message, cause);
		System.out.println("Booking failed: " + message + "Cause: " + cause);
	}

}
