package com.abc.service;

import java.util.List;

import com.abc.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployee(String username);
    Employee deleteEmployee(String username);
	
}
