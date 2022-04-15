package com.ripples.collections.list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Mark", 1001, "Developer", 7978.33f);
		Employee employee2 = new Employee("Mike", 1002, "Developer", 8978.33f);
		Employee employee3 = new Employee("Will", 1003, "Developer", 9978.33f);
		Employee employee4 = new Employee("Tony", 1004, "Developer", 5978.33f);
		Employee employee5 = new Employee("Kyle", 1005, "Developer", 6978.33f);

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		System.out.println(empList);

		// counter for loop
		System.out.println(" ");
		System.out.println("-----counter for loop------------");
		for (int index = 0; index < empList.size(); index++) {
			System.out.println("Element at index: " + index + " : " + empList.get(index));
		}

		empList.add(1, employee4);
		empList.add(0, employee5);

		// Iterator
		System.out.println(" ");
		System.out.println("-----Iterator for list------------");
		Iterator<Employee> employeeList = empList.iterator();
		while (employeeList.hasNext()) {
			System.out.println(employeeList.next());
		}

		// replace
		System.out.println(" ");
		System.out.println("-----Replace index 0 with employee3 & 4 with employee5------------");
		empList.set(0, employee3);
		empList.set(4, employee5);
		
		
		empList.remove(3);
		empList.get(0).name = "Jackson";
		empList.get(0).id = 9099;
		empList.get(0).roll = "Project Manager";

		
		System.out.println(" ");
		// enhanced for loop
		System.out.println("-----Enhanced for loop------------");
		for (Employee epl : empList) {
			System.out.println(epl);
		}
		
		
		System.out.println("");
		System.out.println(empList.get(0));

		System.out.println(" ");
		// Iterator
		System.out.println("-----Iterator: get only salary of all employees------------");
		Iterator<Employee> employeeList2 = empList.iterator();
		while (employeeList2.hasNext()) {
			System.out.println(employeeList2.next().salary);
		}

	}
}
