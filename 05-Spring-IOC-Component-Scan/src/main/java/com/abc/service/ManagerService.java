package com.abc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abc.model.HRService;

@Component
public class ManagerService {
	
	private EmployeeService employeeService; 
	
	private HRService hrService;
	

	public void assignTask() {
		System.out.println("Manager Assigns task");
		employeeService.doPunchAtEntry();
		hrService.hrRecruitment();
	}
	
	
	public HRService getHrService() {
		return hrService;
	}

   @Autowired
	public void setHrService(HRService hrService) {
		this.hrService = hrService;
	}


	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
}

