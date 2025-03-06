package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.model.HumanBody;

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
        HumanBody body = context.getBean(HumanBody.class);
        body.breath();
        
    }
}
