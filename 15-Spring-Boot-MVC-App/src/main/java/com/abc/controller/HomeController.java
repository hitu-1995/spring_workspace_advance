package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String  landingPage() {
		System.out.println("landingPage :: Called");
		return "/view/index.jsp";
	}
	
	@RequestMapping("/logPage")
	public String loginPage() {

		return "/view/login.jsp";

	}
	
	@RequestMapping("/regPage")
	public String registerPage() {
		return "/view/register.jsp";
	}
	
}
