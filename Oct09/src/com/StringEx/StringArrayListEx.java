package com.StringEx;

import java.util.ArrayList;

class Employee {

	int Emp_id;
	String name;
	String city;

	public Employee(int i, String name, String city) {
		super();
		Emp_id = i;
		this.name = name;
		this.city = city;
	}

	public String toString() {

		return Emp_id + " " + name + " " + city;
	}

}

public class StringArrayListEx {

	public static void main(String[] args) {

//		Employee e1 = new Employee(11, "Krishna", "Pune");
//		Employee e2 = new Employee(12, "Rohit", "Kharadi");
//		Employee e3 = new Employee(13, "Akash", "Nagpur");
//		Employee e4 = new Employee(41, "Sagar", "Mumbai");
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
//		System.out.println(e4);
		
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		
		e.add(new Employee(11, "Krishna", "Pune"));
		e.add(new Employee(12, "Rohit", "Kharadi"));
		e.add(new Employee(13, "Akash", "Nagpur"));
		e.add(new Employee(41, "Sagar", "Mumbai"));
		
		for (Employee ee : e) {
			System.out.println(e);
		}
	}

}
