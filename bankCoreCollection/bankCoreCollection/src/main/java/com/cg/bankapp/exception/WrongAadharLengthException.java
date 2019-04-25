package com.cg.bankapp.exception;

public class WrongAadharLengthException extends Exception{

	private static final long serialVersionUID = 1L;

	public WrongAadharLengthException(){
		System.err.println("Aadhar card number should be only 12 digits.");
	}
}
