package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MotherMobile {

	@Autowired // this annotation is use perform DI automatically
	@Qualifier(value = "jio") // this annotation is used to specify which is the qualifying bean is applicable for Autowiring process
	private Sim sim;

//	@Autowired   // this annotation is use perform DI automatically
//	@Qualifier(value = "jio") // this annotation is used to specify which is the qualifying bean is applicable for Autowiring process 
//	public void setSim(Sim sim) {
//		System.out.println("MotherMobile :: Setter :: Called");
//		this.sim = sim;
//	}
//	
//	
//     @Autowired
//	public MotherMobile(@Qualifier("jio") Sim sim) {
//    	 System.out.println("MotherMobile :: param :: Const");
//		this.sim = sim;
//	}

	public void operate() {

		System.out.println("mobile working stated");
		sim.call();
		System.out.println("mobile working end");
	}

}
