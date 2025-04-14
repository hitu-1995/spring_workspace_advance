package com.abc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

	public List<Student> getAllStudents() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Student");
		List<Student> list = query.getResultList();
		return list;
	}

}
