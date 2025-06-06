package com.abc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
