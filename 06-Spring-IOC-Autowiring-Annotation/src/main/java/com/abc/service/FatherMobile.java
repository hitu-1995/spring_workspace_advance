package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FatherMobile {

	private Sim sim;

	@Autowired
	@Qualifier(value = "airtel")
	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void operate() {

		System.out.println("mobile working stated");
		sim.call();
		System.out.println("mobile working end");
	}

}
