package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Employee;
import com.abc.service.EmployeeService;

@RestController
@RequestMapping("/api/employee-service")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	@PostMapping("/register")
	@PreAuthorize("hasRole('ROLE_USER')")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return service.saveEmployee(employee); 
	}
	
	@GetMapping("/")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Employee> getAllEmployees() {
		
		return service.getAllEmployee();
	}
	
	@GetMapping("/{username}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Employee getEmployee(@PathVariable String username) {
		
		return service.getEmployee(username);
	}
	
	@DeleteMapping("/{username}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Employee deleteEmployee(@PathVariable String username) {
		
		return service.deleteEmployee(username);
	}
}
