package com.abc.service;

import org.springframework.stereotype.Component;


public class ManagerService {
	
	private EmployeeService employeeService;

	public void assignTask() {
		System.out.println("Manager Assigns task");
		employeeService.doPunchAtEntry();
	}
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


}

