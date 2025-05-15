package com.abc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int pid;
	private String name;
	private String brand;
	private double price;
	private String category;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + ", category="
				+ category + "]";
	}

	public Product() {

	}

	
	public Product(int pid, String name, String brand, double price, String category) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.category = category;
	}

}
