package com.abc;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.model.HRService;
import com.abc.service.EmployeeService;
import com.abc.service.ManagerService;

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
          

          ManagerService m1 = context.getBean(ManagerService.class);
          

          
          m1.assignTask();
          
          
          

//        String[] beanNames = context.getBeanDefinitionNames();
//        
//        for(String name:beanNames)
//        {
//     	   System.out.println(name);
//        }
//        
     
          
//          EmployeeService emp1 = context.getBean(EmployeeService.class);
//          emp1.doWork();
//          emp1.doPunchAtEntry();
//          
//          
//          HRService h1 = context.getBean(HRService.class);
//          h1.hrRecruitment();
          
    }
}
