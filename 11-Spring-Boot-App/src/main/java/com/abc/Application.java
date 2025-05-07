package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("main----start");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("********** "+context.getClass().getName()+"  **************");
		System.out.println(" Count :   "+context.getBeanDefinitionCount());
		System.out.println("main----ends");
	}

}
