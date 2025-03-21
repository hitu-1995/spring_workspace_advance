package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.config.BeanConfig;
import com.abc.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
         //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Employee employee1 = context.getBean("emp2",Employee.class);
        System.out.println(employee1);
        Integer num = context.getBean(Integer.class);
        System.out.println(num);
        System.out.println("main---ends");
        
    }
}
