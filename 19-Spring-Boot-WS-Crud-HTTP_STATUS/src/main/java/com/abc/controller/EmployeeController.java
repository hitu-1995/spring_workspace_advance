package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Employee;
import com.abc.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/")   // http://localhost:9090/api/employee/
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		 
		return service.saveEmployee(employee);
	}

	@GetMapping("/") // http://localhost:9090/api/employee/
	public ResponseEntity<List<Employee>> getAllEmployees() {
		
		return service.getAllEmployees();
	}

	@GetMapping("/{eid}")  // http://localhost:9090/api/employee/101
	public ResponseEntity<Employee> getEmployee(@PathVariable int eid) {
		
		return service.getEmployee(eid);
	}
	
	@GetMapping("/email/{email}")   // http://localhost:9090/api/employee/yogesh@gmail.com
	public ResponseEntity<Employee> getEmployeeByEmail(@PathVariable String email) {
		
		return service.getEmployeeByEmail(email);
	}
	
	@DeleteMapping("/{eid}") // http://localhost:9090/101
	public ResponseEntity<Object> deleteEmployee(@PathVariable int eid) {
		 	
		return service.deleteEmployee(eid);
	}

	@PutMapping("/")  // http://localhost:9090/
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
		
		return service.updateEmployee(employee);
	}
}
