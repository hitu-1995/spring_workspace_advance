package com.abc;

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
     
          EmployeeService emp1 = context.getBean(EmployeeService.class);
          emp1.doWork();
          emp1.doPunchAtEntry();
          
          
          ManagerService m1 = context.getBean(ManagerService.class);
          m1.assignTask();
          
          HRService h1 = context.getBean(HRService.class);
          h1.hrRecruitment();
          
    }
}
