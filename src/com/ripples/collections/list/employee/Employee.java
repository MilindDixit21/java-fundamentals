package com.ripples.collections.list.employee;

public class Employee {
	//properties
	public String name;
	public int id;
	public String roll;
	public float salary;
	
	public Employee(String name, int id, String roll, float salary) {
		super();
		this.name = name;
		this.id = id;
		this.roll = roll;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", roll=" + roll + ", salary=" + salary + "]";
	}
	
}
