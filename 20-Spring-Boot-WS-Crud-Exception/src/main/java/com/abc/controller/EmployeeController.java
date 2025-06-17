package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.exception.EmployeeServiceException;
import com.abc.model.Employee;
import com.abc.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	

	@PostMapping("/") // http://localhost:9090/api/employee/
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/") // http://localhost:9090/api/employee/
	public ResponseEntity<List<Employee>> getAllEmployees() {
		return service.getAllEmployees();
	}

	@GetMapping("/{eid}") // http://localhost:9090/api/employee/101
	public ResponseEntity<Employee> getEmployee(@PathVariable int eid) {
		return service.getEmployee(eid);
	}

	@GetMapping("/email/{email}") // http://localhost:9090/api/employee/yogesh@gmail.com
	public ResponseEntity<Employee> getEmployeeByEmail(@PathVariable String email) {
		return service.getEmployeeByEmail(email);
	}

	@DeleteMapping("/{eid}") // http://localhost:9090/101
	public ResponseEntity<Object> deleteEmployee(@PathVariable int eid) {
		return service.deleteEmployee(eid);
	}

	@PutMapping("/") // http://localhost:9090/
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}

	@GetMapping("/devide1/{number}")
	public ResponseEntity<?> devide1(@PathVariable int number) {
		int result;
		try {
			result = 100 / number;
		} catch (ArithmeticException e) {
			return new ResponseEntity<String>("ArithmeticException in devide1 method",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    try {
	    	String str = null;
			System.out.println(str.toUpperCase());
		} catch (Exception e) {
			return new ResponseEntity<String>("NullPointerException in devide1 method",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	@GetMapping("/devide2/{number}")
	public ResponseEntity<?> devide2(@PathVariable int number) {
		int result;
		result = 200 / number;
		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	// This method will responsible to handle only EmployeeController ArithmeticException
	// Local exception handling
	

//	@ExceptionHandler(value = EmployeeServiceException.class)
//	public ResponseEntity<?> employeeServiceException() {
//		return new ResponseEntity<String>("Exception Handled in Local Level ",HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}
