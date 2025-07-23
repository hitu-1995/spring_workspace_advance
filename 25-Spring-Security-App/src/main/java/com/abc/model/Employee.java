package com.abc.model;

public class Employee {

	private int eid;
	private String userName;
	private String password;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(int eid, String userName, String password) {
		this.eid = eid;
		this.userName = userName;
		this.password = password;
	}
	public Employee() {

	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", userName=" + userName + ", password=" + password + "]";
	}

	
	
}
