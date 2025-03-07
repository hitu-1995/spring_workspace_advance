package com.abc.service;

import org.springframework.stereotype.Component;

//@Component
public class EmployeeService {

	public EmployeeService() {
		System.out.println("EmployeeService :: Constructor ");
	}
	
	public void doWork() {
		System.out.println("Employee is working");
	}
	public void doPunchAtEntry() {
		System.out.println("Employee have punched their entry");
	}
}
