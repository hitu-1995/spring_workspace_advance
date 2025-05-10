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
		list.add(new Employee(102, "XYZ", 80000, 31));
		list.add(new Employee(103, "PQR", 20000, 23));
		list.add(new Employee(104, "TUV", 40000, 18));
		list.add(new Employee(105, "LMN", 70000, 45));
		list.add(new Employee(106, "ABC", 70000, 35));

		repository.saveAll(list);

	}
}
