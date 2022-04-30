package com.ripples.exception.handling.bank;

public class InvalidAmountException extends Exception {
	String message;

	InvalidAmountException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [message=" + message + "]";
	}
}
