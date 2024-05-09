package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Salary {
	int id;
	String Name;
	int salary;

	public Salary(int id, String name, int salary) {
		super();
		this.id = id;
		Name = name;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	
	
}

public class SecondLargestSalary {
	public static void main(String[] args) {
       List<Salary> list = new ArrayList<>();
       list.add(new Salary(1,"Rabi",20000));
       list.add(new Salary(2,"kolia",14000));
       list.add(new Salary(3,"Amol",19000));
       list.add(new Salary(1,"Ganesh",25000));
       
//       int uniqueSalary = list.stream().map((a)->a.getSalary())
//    		   .sorted((a,b)->b-a).distinct().skip(1).findFirst().get();
//       
//       List<Salary> secondList = list.stream().filter((sal)->sal.getSalary()==uniqueSalary).collect(Collectors.toList());
//       System.out.println(secondList);
       
       Salary uu = list.stream().sorted((a,b)->b.getSalary()-a.getSalary()).distinct().skip(1).findFirst().get();
       System.out.println(uu);
       
	}
}
