package com.cg.bankapp.exception;

public class CannotWithdrawException extends Exception{
	private static final long serialVersionUID = 1L;

	public CannotWithdrawException() {
		System.err.println("Insufficient balance");
	}
}
