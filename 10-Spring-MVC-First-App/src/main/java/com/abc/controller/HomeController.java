package com.abc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String landingPage() {
	System.out.println("landing Page :: Called");
		return "/view/index.jsp";
	}
}
