package com.abc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.model.Student;
import com.abc.repository.StudentRepository;

@Service
public class StudentServiceIMPL {

	@Autowired
	private StudentRepository repository;

	public void check() {

		
	}

	private void existByID() {
		boolean flag = repository.existsById(999);
           System.out.println("Record is present  :   "+flag);
	}

	private void getCount() {
		long count = repository.count();
        System.out.println(count);
	}

	private void deleteMultipleRecordById() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(102);
		list.add(103);
		repository.deleteAllById(list);
	}

	private void deletesingleById() {
		repository.deleteById(105);
	}

	private void getAllRecords() {
		for (Student stu : repository.findAll()) {

			System.out.println(stu);
		}
	}

	private void getMultipleById() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(102);
		list.add(103);
		list.add(104);

		for (Student stu : repository.findAllById(list)) {

			System.out.println(stu);
		}
	}

	private void getSingle() {
		Optional<Student> opt = repository.findById(102);
		if (opt.isPresent()) {
			Student stu = opt.get();
			System.out.println(stu);
		} else {
			System.out.println("Student is not present.........");
		}
	}

	private void insertAll() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(103, "Rahul", "Akurdi"));
		list.add(new Student(104, "Ankit", "Ravet"));
		list.add(new Student(105, "Tushar", "Nigadi"));
		list.add(new Student(106, "Vishal", "Akurdi"));

		repository.saveAll(list);
	}

	private void insertSingle() {
		Student stu = new Student();
		stu.setRollno(102);
		stu.setName("Mahesh");
		stu.setAddress("Akurdi");

		repository.save(stu);
	}
}
