package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.model.Employee;

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
        Employee employee = context.getBean(Employee.class);
       

        System.out.println(employee);
        for(String skill:employee.getSkills())
        {
        	System.out.println("-------------------------");
        	System.out.println(skill);
        }
    }
}
