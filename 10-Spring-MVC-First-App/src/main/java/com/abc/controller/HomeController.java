package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	//@ResponseBody
	public String loginCheck(@RequestParam String uname, 
								@RequestParam String pass,
								Model model) {
		
		System.out.println("loginCheck Page :: Called  " + uname + "   " + pass);

		List<Student> list = service.loginCheck(uname, pass);

		if (!list.isEmpty())
		{
			model.addAttribute("data", list);
			return "success";  // 
		}	
		else
			return "login";
		
	}

	@RequestMapping("/reg")
	public String saveStudent(@ModelAttribute Student student) {
		System.out.println("------In---HomeController-------------");
		service.saveStudent(student);

		return "login";
	}


	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int rollno, Model model) {
	    // delete Student of this rollno and return updated list to success page
		List<Student> list = service.deleteStudent(rollno);
		model.addAttribute("data",list);
		return "success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int rollno, Model model) {
		System.out.println("Rollno "+rollno);
		Student stu =  service.editStudent(rollno);
		model.addAttribute("stu", stu);
		return "update";
	}

	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student student , Model model) {
		
	 List<Student> list = 	service.updateStudent(student);
	    model.addAttribute("data", list);
		return "success";
	}
	
}
