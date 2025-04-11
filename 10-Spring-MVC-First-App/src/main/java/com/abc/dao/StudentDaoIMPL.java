package com.abc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abc.model.Student;

@Repository
public class StudentDaoIMPL implements StudentDao{

	@Autowired
	private SessionFactory factory;
	
	public void saveStudent(Student student) {
		 System.out.println("-----------In---StudentDaoIMPL----------------");
		   Session session = factory.openSession();
		   session.save(student);
		   session.beginTransaction().commit();
	}

}
