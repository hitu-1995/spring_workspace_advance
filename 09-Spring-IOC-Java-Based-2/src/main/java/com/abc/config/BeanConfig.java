package com.abc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.abc")
@PropertySource(value = "jdbc.properties")
public class BeanConfig {


//	   @Bean
//	   @Scope(value = "prototype")
//	   public Employee emp() {
//		Employee employee = new Employee();
//		employee.setEid(101);
//		employee.setEname("Virat");
//		employee.setSalary(30000);
//		return employee;
//	}
//	
	
	
}
