package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abc.service.StudentServiceIMPL;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("main---start");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentServiceIMPL serviceIMPL = context.getBean(StudentServiceIMPL.class);
		serviceIMPL.check();
		
		System.out.println("main---ends");
	}

}
