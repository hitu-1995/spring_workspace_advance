package com.abc.dao;

import java.util.List;

import com.abc.model.Student;

public interface StudentDao {

	void saveStudent(Student student);

	List<Student> getAllStudents();
}
