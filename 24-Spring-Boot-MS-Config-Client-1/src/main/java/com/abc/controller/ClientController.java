package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.util.DbConnectionInfo;

@RestController
@RequestMapping("/api/client1")
public class ClientController {

	@Value("${app.message}")
	private String message;
	
	@Autowired
	private DbConnectionInfo dbconnection;
	
	
	@GetMapping("/")
	public String  getNotification() {
		
		return message;
	}
	
	@GetMapping("/connection")
	public DbConnectionInfo getConnection() {
		
		return dbconnection;
	}
}
