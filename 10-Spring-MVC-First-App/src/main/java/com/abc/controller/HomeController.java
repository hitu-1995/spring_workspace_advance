package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String landingPage() {
	System.out.println("landing Page :: Called");
		return "index";   // partial name
	}
	

	@RequestMapping("/logPage")
	public String logPage() {
	System.out.println("logPage Page :: Called");
		return "login";
	}
	@RequestMapping("/regPage")
	public String regPage() {
	System.out.println("regPage Page :: Called");
		return "register";
	}
	
	@RequestMapping("/log")
	public String loginCheck(@RequestParam String uname, @RequestParam String pass) {
	System.out.println("loginCheck Page :: Called  "+uname+"   "+pass);
	
	    if(uname.equals("Admin") && pass.equals("Admin@123"))
		return "success";
	    else
	    return "login"; 	
	    
	}
	
}
