package com.cjc.model;

public class Student {

	private int rollno;
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		System.out.println("setRollno::Called");
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName::Called");
		this.name = name;
	}

	public Student() {
		System.out.println("Student----Constructor");
	}

	public Student(int rollno, String name) {
		System.out.println("Student :: param::Constructor");
		this.rollno = rollno;
		this.name = name;
	}

}
