package com.abc;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.config.BeanConfig;
import com.abc.util.JDBCUtils;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		/*
		 * EmployeeService service1 = context.getBean(EmployeeService.class);
		 * EmployeeService service2 = context.getBean(EmployeeService.class);
		 * System.out.println(service1); System.out.println(service2);
		 */
		
		/*
		 * Employee employee1 = context.getBean(Employee.class); Employee employee2 =
		 * context.getBean(Employee.class); System.out.println(employee1);
		 * System.out.println(employee2);
		 */		 
		
		  JDBCUtils utils = context.getBean(JDBCUtils.class);
		  System.out.println(utils);
		System.out.println("main---ends");

	}
}
