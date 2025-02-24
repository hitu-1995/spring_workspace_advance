package com.cjc.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cjc.model.Student;

public class Test {

	public static void main(String[] args) {
		System.out.println("main----start");

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Student student = context.getBean(Student.class);

		System.out.println("Student rollno :   " + student.getRollno());
		System.out.println("Student Name :  " + student.getName());
		System.out.println("main-----ends");
	}

	private static void beanFactoryContainer() {
		ClassPathResource resource = new ClassPathResource("bean.xml");

		BeanFactory factory = new XmlBeanFactory(resource);

		// Student student = factory.getBean("stu2",Student.class);
	}
}
