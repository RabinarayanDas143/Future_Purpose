package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.List;

class Department {
	int id;
	String Name;
	String Department;
	int salary;

	public Department(int id, String name, String department, int salary) {
		super();
		this.id = id;
		Name = name;
		Department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", Name=" + Name + ", Department=" + Department + ", salary=" + salary + "]";
	}
	
	

}

public class SecondHighestInDepartment {
	public static void main(String[] args) {
       List<Department> departmentList = new ArrayList<>();
       departmentList.add(new Department(1, "Rabi", "Java", 20000));
       departmentList.add(new Department(2, "Amol", "Java", 30000));
       departmentList.add(new Department(3, "kolia", "FullStack", 14000));
       departmentList.add(new Department(4, "Ganesh", "Sql", 250000));
       departmentList.add(new Department(5, "Aakash", "Sql", 19000));
       departmentList.add(new Department(6, "Sandesh", "FullStack", 50000));
       departmentList.add(new Department(7, "Hiamnsu", "Java", 30000));
       departmentList.add(new Department(8, "Sarubh", "Java", 25000));
       departmentList.add(new Department(9, "Ankit", "React", 90000));
       departmentList.add(new Department(10, "Beekshan", "React", 100000));
       
       
	}
}
