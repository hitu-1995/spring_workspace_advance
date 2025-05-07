package com.abc.Spring_Boot_First_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);	
	}
	
	@EventListener(classes = ApplicationStartedEvent.class)
	public void demo() {
		System.out.println("-------Hello World------------");
	}
	 

}
