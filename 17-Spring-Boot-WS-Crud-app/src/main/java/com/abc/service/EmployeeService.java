package com.abc.service;

import java.util.List;

import com.abc.model.Employee;

public interface EmployeeService {

	// create new record in DB
	Employee saveEmployee(Employee employee);

	// Fetch specific id record from DB
	Employee getEmployee(int eid);

	// Fetch All records from DB
	List<Employee> getAllEmployees();

	// Fetch Specific email Record from DB 
	Employee getEmployeeByEmail(String email);

    // delete employee by id 
	Employee deleteEmployee(int eid);

	// update record
	Employee updateEmployee(Employee employee);

}
