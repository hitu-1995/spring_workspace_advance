package com.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abc.model.Employee;

@Configuration
@ComponentScan(basePackages = {"com.abc","com.xyz"})
public class BeanConfig {

	@Bean
	public Employee  emp1() {
		
		Employee employee  = new Employee();
			employee.setEid(101);
			employee.setEname("Virat");
			employee.setSalary(90000);
			return employee;
	}
	
	@Bean
	public Employee  emp2() {
		
		Employee employee  = new Employee();
			employee.setEid(102);
			employee.setEname("Rohit");
			employee.setSalary(80000);
			return employee;
	}
	
	@Bean
	public Integer getNumber() {

		return new Integer(100);
	}
}
