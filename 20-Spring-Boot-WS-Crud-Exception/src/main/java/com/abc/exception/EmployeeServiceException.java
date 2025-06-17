package com.abc.exception;

public class EmployeeServiceException extends RuntimeException {

	public EmployeeServiceException() {
		super("EmployeeServiceException Occurred ");
	}
	
	public EmployeeServiceException(String message) {
		super(message);
	}
	
}
