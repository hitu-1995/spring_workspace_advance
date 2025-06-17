package com.abc.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.abc.exception.EmployeeServiceException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = EmployeeServiceException.class)
	public ResponseEntity<?> employeeServiceException(EmployeeServiceException e) {
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<String> arithmeticException() {
		System.out.println("--------------ArithmeticException--------------");
		return new ResponseEntity<String>("ArithmeticException in EmployeeContoller method", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
