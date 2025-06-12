package com.abc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")  // base URL
public class UserController {

	@GetMapping("/")
	public String greet() {
		
		return "Welcome to User Controller";
	}
	@GetMapping("/devide2/{number}")
	public ResponseEntity<?> devide2(@PathVariable int number) {
		int result;
		result = 200 / number;
		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}
}
