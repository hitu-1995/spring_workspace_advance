package com.abc.dao;

import java.util.List;

import com.abc.model.Student;

public interface StudentDao {

	void saveStudent(Student student);

	List<Student> getAllStudents();

	List<Student> deleteStudent(int rollno);

	Student editStudent(int rollno);
}
