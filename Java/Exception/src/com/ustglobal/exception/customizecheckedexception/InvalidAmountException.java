package com.ustglobal.exception.customizecheckedexception;

public class InvalidAmountException extends Exception {
	private String message = "Daily limit is 40000";
	
	public String getMessage() {
		return message;
	}

}
