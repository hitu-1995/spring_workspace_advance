package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.StudentDao;
import com.abc.model.Student;

@Service
public class StudentServiceIMPL implements StudentService{

	 @Autowired
	  private StudentDao dao;
	  
	public void saveStudent(Student student) {
		System.out.println("----------In--StudentServiceIMPL---------");
		dao.saveStudent(student);
		
	}

}
