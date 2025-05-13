package com.abc.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.model.Employee;
import com.abc.repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL {

	@Autowired
	private EmployeeRepository repository;

	public void check() {

		System.out.println(repository.findByAge(31));
		

	}

	private void getNameLike() {
		repository.findByMyNameLike("A%")
		.forEach(e -> System.out.println(e));
	}

	private void getSalaryGreaterThanEqual() {
		repository.findBySalaryGreaterThanEqual(40000)
			.forEach(e -> System.out.println(e));
	}

	private void getSalaryGreaterThan() {
		repository.findBySalaryGreaterThan(40000)
			.forEach(e -> System.out.println(e));
	}

	private void getSalaryBetween() {
		repository.findBySalaryBetween(30000, 85000)
		  			.forEach(e -> System.out.println(e));
	}

	private void getByAge() {
		List<Employee> list = repository.findByAgeAndSalary(18, 40000);
		  list.forEach(e -> System.out.println(e));
	}

	private void getDistinctByAge() {
		List<Employee> list = repository.findDistinctByAge(31);
		  list.forEach(e -> System.out.println(e));
	}

	private void getByName() {
		List<Employee> list = repository.findByMyName("ABC");
          for(Employee emp :list)
          { 
        	 System.out.println(emp);  
          }
	}

	@PostConstruct
	public void insertRecords() {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "ABC", 90000, 34));
		list.add(new Employee(102, "XYZ", 20000, 31));
		list.add(new Employee(102, "JKL", 50000, 31));
		list.add(new Employee(102, "AEF", 80000, 31));
		list.add(new Employee(103, "PQR", 20000, 23));
		list.add(new Employee(104, "ADC", 40000, 18));
		list.add(new Employee(105, "LMN", 70000, 45));
		list.add(new Employee(106, "ABC", 40000, 18));

		repository.saveAll(list);

	}
}
