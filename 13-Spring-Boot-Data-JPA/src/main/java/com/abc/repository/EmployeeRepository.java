package com.abc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abc.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

	   List<Employee> findByMyName(String name);
	   
	   List<Employee> findDistinctByAge(int age);
	   
	   List<Employee> findByAgeAndSalary(int age, double salary);
	   
	   List<Employee> findBySalaryBetween(double salary1, double salary2);
	   
	   List<Employee> findBySalaryGreaterThan(double salary);
	   
	   List<Employee> findBySalaryGreaterThanEqual(double salary);

	   List<Employee> findByMyNameLike(String pattern);

	   @Query(value = "select e from Employee e where e.age = :age")
	  Employee findByAge(@Param("age") int age);
	   
	   // mobile, email, id, username
	   
}
