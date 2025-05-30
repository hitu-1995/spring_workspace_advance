package com.abc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	private String eaddress;
	private long emobile;
	
	@Column(unique = true)
	private String email;
	
	private double esalary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public long getEmobile() {
		return emobile;
	}

	public void setEmobile(long emobile) {
		this.emobile = emobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", emobile=" + emobile
				+ ", email=" + email + ", esalary=" + esalary + "]";
	}

	public Employee() {

	}

	public Employee(int eid, String ename, String eaddress, long emobile, String email, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.emobile = emobile;
		this.email = email;
		this.esalary = esalary;
	}

}
