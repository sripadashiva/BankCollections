package com.cg.bankapp.exception;

public class WrongLoginCredentialsException extends Exception{
	private static final long serialVersionUID = 1L;

	public WrongLoginCredentialsException() {
		System.out.println("Invalid username or password");
	}
}
