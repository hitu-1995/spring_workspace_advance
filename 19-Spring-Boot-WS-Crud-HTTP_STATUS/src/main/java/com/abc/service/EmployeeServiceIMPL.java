package com.abc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.abc.model.Employee;
import com.abc.repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public ResponseEntity<Employee> saveEmployee(Employee employee) {
		if (empRepository.existsById(employee.getEid())) {
			// Employee emp = empRepository.save(employee);
			return new ResponseEntity<Employee>(employee, HttpStatus.ALREADY_REPORTED);
		} else {
			Employee emp2 = empRepository.save(employee);
			return new ResponseEntity<Employee>(emp2, HttpStatus.CREATED);
		}
	}

	@Override
	public ResponseEntity<Employee> getEmployee(int eid) {

		if (empRepository.existsById(eid)) {
			Employee emp = empRepository.findById(eid).get();
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		} else
			return new ResponseEntity<Employee>(new Employee(), HttpStatus.NOT_ACCEPTABLE);
	}

	@Override
	public ResponseEntity<List<Employee>> getAllEmployees() {

		return ResponseEntity.status(HttpStatus.OK).body(empRepository.findAll());
	}

	@Override
	public ResponseEntity<Employee> getEmployeeByEmail(String email) {
		Optional<Employee> optional = empRepository.findByEmail(email);
       System.out.println("------------ "+email+"  ---------------");
		if (optional.isPresent()) {
			return new ResponseEntity<Employee>(optional.get(), HttpStatus.OK);
		} else
			return new ResponseEntity<Employee>(new Employee(), HttpStatus.NOT_ACCEPTABLE);
	}

	@Override
	public ResponseEntity<Object> deleteEmployee(int eid) {

		Optional<Employee> optional = empRepository.findById(eid);
		if (optional.isPresent()) {
			Employee emp = optional.get();
			empRepository.deleteById(eid);
			return new ResponseEntity<Object>(emp,HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Employee Not found in Records",HttpStatus.NOT_ACCEPTABLE);
	}

	@Override
	public ResponseEntity<?> updateEmployee(Employee employee) {

		Optional<Employee> optional = empRepository.findById(employee.getEid());
		if (optional.isPresent())
			return new ResponseEntity<Employee>(empRepository.save(employee),HttpStatus.OK);
		else
			return new ResponseEntity<String>("Employee Not Found",HttpStatus.CONFLICT);
	}

}
