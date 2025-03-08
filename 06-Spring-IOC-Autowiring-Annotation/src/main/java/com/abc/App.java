package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.service.FatherMobile;
import com.abc.service.MotherMobile;

public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
         FatherMobile mobile = context.getBean(FatherMobile.class);
         mobile.operate();
         
         MotherMobile mob =  context.getBean(MotherMobile.class);
         mob.operate();
      
    }
}
