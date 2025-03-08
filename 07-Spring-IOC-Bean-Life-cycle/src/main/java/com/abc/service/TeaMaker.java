package com.abc.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TeaMaker {

	
	@PostConstruct
	public void init() {
		System.out.println("Turn on Gas....\n");
	}
	
	public void makeTea() {
		   System.out.println("Take Milk");
		   System.out.println("Take Sugar");
		   System.out.println("Take Tea Powder");
		   System.out.println("Add in bowl and create");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Turn off Gas...\n");
	}
	
}
