package com.abc.config;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.abc.model.Student;

@Configuration
@ComponentScan(basePackages = "com.abc")
public class BeanConfig {

	@Bean
	 public DriverManagerDataSource ds() {
		 DriverManagerDataSource ds = new DriverManagerDataSource();
		 ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 ds.setUrl("jdbc:mysql://localhost:3306/weekendbatch");
		 ds.setUsername("root");
		 ds.setPassword("root");
		 return ds;
	}
	
	@Bean
	@Transactional
	public LocalSessionFactoryBean lsf() {
		
		LocalSessionFactoryBean lsf = new  LocalSessionFactoryBean();
		  lsf.setDataSource(ds());
	      Properties prop = new Properties();
	      prop.put(Environment.HBM2DDL_AUTO, "update");
	      prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL55Dialect");
	      prop.put(Environment.SHOW_SQL,true);
	      prop.put(Environment.FORMAT_SQL, true);

	      lsf.setHibernateProperties(prop);
	      lsf.setAnnotatedClasses(Student.class);
	      
		return lsf;
	}

	@Bean
	 public InternalResourceViewResolver  viewResolver() {
		
		 InternalResourceViewResolver rs = new InternalResourceViewResolver();
		 rs.setPrefix("/view/");
		 rs.setSuffix(".jsp");
		 return rs;
	}
}
