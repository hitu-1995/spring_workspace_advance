package com.abc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.model.Employee;

import jakarta.annotation.PostConstruct;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> empList = new ArrayList<>();

	@PostConstruct
	public void init() {
	empList.add(new Employee(101, "Hitesh", "Hitesh@123"));
	empList.add(new Employee(102, "Nilesh", "Nilesh@123"));
	empList.add(new Employee(103, "Ritesh", "Ritesh@123"));
	empList.add(new Employee(104, "Rajesh", "Rajesh@123"));
	empList.add(new Employee(105, "Yogesh", "Yogesh@123"));
	empList.add(new Employee(106, "Mitesh", "Mitesh@123"));
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		empList.add(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empList;
	}

	@Override
	public Employee getEmployee(String username) {
		
		return empList.stream().filter(emp -> emp.getUserName().equals(username)).findAny().orElse(null);
	}

	@Override
	public Employee deleteEmployee(String username) {
		Employee employee = empList.stream().filter(emp -> emp.getUserName().equals(username)).findAny().orElse(null);
		if(empList.contains(employee))
			empList.remove(employee);
		return employee;
	}

}
