package com.abc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.model.Employee;
import com.abc.repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = empRepository.save(employee);
		return emp;
	}

	@Override
	public Employee getEmployee(int eid) {

		if (empRepository.existsById(eid))
			return empRepository.findById(eid).get();
		else
			return new Employee();
	}

	@Override
	public List<Employee> getAllEmployees() {

		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeByEmail(String email) {
		Optional<Employee> optional = empRepository.findByEmail(email);

		if (optional.isPresent())
			return optional.get();
		else
			return new Employee();
	}

	@Override
	public Employee deleteEmployee(int eid) {

		Optional<Employee> optional = empRepository.findById(eid);
		if (optional.isPresent()) {
			Employee emp = optional.get();
			empRepository.deleteById(eid);
			return emp;
		}
		return new Employee();
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		Optional<Employee> optional = empRepository.findById(employee.getEid());
		if (optional.isPresent())
			return empRepository.save(employee);
		else
			return new Employee();
	}

}
