package com.employeeds.Domain;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {
		
	protected Role role;			
	protected double salaryPerMonth;
		
	public Employee() {}

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
		
	public Employee(String name, Role role) {
		super(name);
		// TODO Auto-generated constructor stub
		this.role = role;		
		this.salaryPerMonth = role.getSalary();
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + super.getId()+ ", name=" + super.getName() + ", role=" + role + ", salaryPerMonth = " + salaryPerMonth + "]";
	}
		
}
