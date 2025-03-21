package com.abc.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class EmployeeService {

	public EmployeeService() {
		System.out.println("EmployeeService :: Constructor");
	}
}
