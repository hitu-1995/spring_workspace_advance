package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abc.model.Student;
import com.abc.service.StudentService;

@Controller
public class HomeController {

	   @Autowired
	   private StudentService service;
	
	@RequestMapping("/")
	public String landingPage() {
		System.out.println("landing Page :: Called");
		return "index"; // partial name
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
		System.out.println("loginCheck Page :: Called  " + uname + "   " + pass);

		if (uname.equals("Admin") && pass.equals("Admin@123"))
			return "success";
		else
			return "login";
	}

	@RequestMapping("/reg")
	public String saveStudent(@ModelAttribute Student student) {
		System.out.println("------In---HomeController-------------");
		service.saveStudent(student);
		
		return "login";
	}
}
