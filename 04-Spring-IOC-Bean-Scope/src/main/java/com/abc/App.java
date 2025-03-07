package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
     
//          EmployeeService emp1 = context.getBean(EmployeeService.class);
//          EmployeeService emp2 = context.getBean(EmployeeService.class);
//          
//          System.out.println(emp1);
//          System.out.println(emp2);
        
    }
}
