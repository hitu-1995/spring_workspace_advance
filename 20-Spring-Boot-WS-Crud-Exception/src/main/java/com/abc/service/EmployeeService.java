package com.abc.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.abc.model.Employee;

public interface EmployeeService {

	// create new record in DB
	ResponseEntity<Employee> saveEmployee(Employee employee);

	// Fetch specific id record from DB
	ResponseEntity<Employee> getEmployee(int eid);

	// Fetch All records from DB
	ResponseEntity<List<Employee>> getAllEmployees();

	// Fetch Specific email Record from DB 
	ResponseEntity<Employee> getEmployeeByEmail(String email);

    // delete employee by id 
	ResponseEntity<Object> deleteEmployee(int eid);

	// update record
	ResponseEntity<?> updateEmployee(Employee employee);

}
