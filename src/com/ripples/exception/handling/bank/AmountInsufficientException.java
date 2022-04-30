package com.ripples.exception.handling.bank;

public class AmountInsufficientException extends RuntimeException {
	String message;

	AmountInsufficientException(String message) {
		this.message=message;
	}

	@Override
	public String toString() {
		return "Invalid Amount Exception [message=" + message + "]";
	}
	
}
