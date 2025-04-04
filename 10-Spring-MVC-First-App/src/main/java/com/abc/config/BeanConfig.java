package com.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.abc")
public class BeanConfig {

	@Bean
	 public InternalResourceViewResolver  viewResolver() {
		
		 InternalResourceViewResolver rs = new InternalResourceViewResolver();
		 rs.setPrefix("/view/");
		 rs.setSuffix(".jsp");
		 return rs;
	}
}
