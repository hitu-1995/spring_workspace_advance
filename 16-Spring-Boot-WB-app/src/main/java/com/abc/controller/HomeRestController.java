package com.abc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@RequestMapping("/")
	public String  greet() {
		
		return "Welcome to Spring APP";
	}
}
