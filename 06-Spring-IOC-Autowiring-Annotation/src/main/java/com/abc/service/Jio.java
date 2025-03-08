package com.abc.service;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{

	public void call() {
		System.out.println("Jio calling started....");
	}
}
