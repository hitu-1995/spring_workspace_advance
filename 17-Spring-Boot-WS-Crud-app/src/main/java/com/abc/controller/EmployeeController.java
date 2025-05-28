package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Employee;
import com.abc.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee emp = service.saveEmployee(employee);
		return emp;
	}
	
	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)  
	public List<Employee> getAllEmployees() {
		
		return service.getAllEmployees();
	}
	
	@RequestMapping(value = "/getEmployee/{eid}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable int eid) {
		
		return service.getEmployee(eid);
	}
	
	@RequestMapping(value = "/getEmployeeByMail/{email}", method = RequestMethod.GET)
	public Employee getEmployeeByEmail(@PathVariable String email) {
		
		return service.getEmployeeByEmail(email);
	}
	@RequestMapping(value = "/deleteEmployee/{eid}", method = RequestMethod.DELETE)
	public Employee deleteEmployee(@PathVariable int eid) {
		
		return service.deleteEmployee(eid);
	}
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return service.updateEmployee(employee);
	}
}
