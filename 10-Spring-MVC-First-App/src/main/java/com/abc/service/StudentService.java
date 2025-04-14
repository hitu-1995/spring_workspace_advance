package com.abc.service;

import java.util.List;

import com.abc.model.Student;

public interface StudentService {

	  void saveStudent(Student student);
	  
	  List<Student> loginCheck(String uname, String pass);
}
