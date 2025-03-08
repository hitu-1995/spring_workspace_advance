package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.service.TeaMaker;

public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
         TeaMaker maker = context.getBean(TeaMaker.class);
         maker.makeTea();
         
         ConfigurableApplicationContext con = (ConfigurableApplicationContext)context;
         con.close();
         
         System.out.println(context.getClass().getName());
    }
}
