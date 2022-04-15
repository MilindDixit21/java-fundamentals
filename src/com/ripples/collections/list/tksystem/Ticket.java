package com.ripples.collections.list.tksystem;

public class Ticket {
	
	public int id;
	public String name;
	public double price;
	public String description;
	public String source;
	public String destination;
	
	public Ticket(int id, String name, double price, String description, String source, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.source = source;
		this.destination = destination;
	}
	public Ticket() {
		super();
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + ", source="
				+ source + ", destination=" + destination + "]";
	}
	
	

}
