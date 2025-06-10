package com.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")  // base URL
public class UserController {

	@GetMapping("/")
	public String greet() {
		
		return "Welcome to User Controller";
	}
}
