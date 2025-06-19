package com.abc.model;

public class Product {

	private int pid;
	private String pname;
	private String brand;
	private double price;
	private long stock;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
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
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", brand=" + brand + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	public Product(int pid, String pname, String brand, double price, long stock) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}
	public Product() {
	}
	
	
}
