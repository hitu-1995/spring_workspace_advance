package com.abc.service;

import java.util.ArrayList;
import java.util.List;

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

	public List<Student> loginCheck(String uname, String pass) {
	     if(uname.equals("Admin") && pass.equals("Admin@123"))
		return dao.getAllStudents();
	     else
	    return new ArrayList<Student>();
	}

}
