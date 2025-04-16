package com.abc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		   Transaction tx = session.beginTransaction();
		   session.saveOrUpdate(student);
		    tx.commit();
	}

	public List<Student> getAllStudents() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Student");
		List<Student> list = query.getResultList();
		return list;
	}

	public List<Student> deleteStudent(int rollno) {
		Session session = factory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Student where rollno = :id");
		query.setParameter("id", rollno);
		query.executeUpdate();
		session.getTransaction().commit();
		
		return getAllStudents();
	}

	public Student editStudent(int rollno) {
		
		return factory.openSession().get(Student.class, rollno);
	}

}
