package com.example.Model;

import java.time.LocalDate;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;
	private String gender;
	private LocalDate joiningDate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	

	public Employee(int id, String name, double salary, String department, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
	}

	
	
	public Employee(int id, String name, double salary, String department, String gender, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
		this.joiningDate = joiningDate;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", gender=" + gender + ", joiningDate=" + joiningDate + "]";
	}
	
	

}
