package com.abc.service;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{

	public void call() {
		System.out.println("Airtel calling started....");
	}
}
