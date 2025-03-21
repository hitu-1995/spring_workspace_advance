package com.abc.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JDBCUtils {

	
	@Value("${jdbcutils.driver}")
	private String driver;
	
	@Value("${jdbcutils.username}")
	private String username;
	
	@Value("${jdbcutils.password}")
	private String password;
	
	@Value("${jdbcutils.url}")
	private String url;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "JDBCUtils [driver=" + driver + ", username=" + username + ", password=" + password + ", url=" + url
				+ "]";
	}

	
}
