package com.cg.bankapp.exception;

public class WrongMobileNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongMobileNumberException() {
		System.out.println("Invalid mobile number");
	}
}
