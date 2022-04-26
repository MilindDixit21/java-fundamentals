package com.ripples.serialization.test02;

import java.io.Serializable;

public class Library implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Library(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Library() {
		super();
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
