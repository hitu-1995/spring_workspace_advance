package com.abc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	private String myName;
	private double salary;
	private int age;

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", myName=" + myName + ", salary=" + salary + ", age=" + age + "]";
	}
	public Employee(int eid, String myName, double salary, int age) {
		super();
		this.eid = eid;
		this.myName = myName;
		this.salary = salary;
		this.age = age;
	}
	public Employee() {
	
	}
}
