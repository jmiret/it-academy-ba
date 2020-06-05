package com.employeeds.Domain;

public enum Role {
	
	Employee(2750), 
	Manager(3750),
	Director(5500),
	President(8900);

	private double salary;

	private Role(double salary) {
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
