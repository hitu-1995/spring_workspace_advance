package com.abc.model;

import java.util.List;
import java.util.Map;

public class Employee {

	private int eid;
	private String name;
	private Address address;
	private List<Course> courses;
	private Map<String, String> euipments;
	

	public Map<String, String> getEuipments() {
		return euipments;
	}
	public void setEuipments(Map<String, String> euipments) {
		this.euipments = euipments;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
