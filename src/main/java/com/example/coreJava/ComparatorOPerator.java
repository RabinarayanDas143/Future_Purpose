package com.example.coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1{
	private int id;
	private String name;
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	
	
}

class CompareById implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	
}

class CompareByName implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class ComparatorOPerator {
public static void main(String[] args) {
	List<Employee1> list = new ArrayList<>();
	list.add(new Employee1(10, "Rabi"));
	list.add(new Employee1(2, "Aman"));
	list.add(new Employee1(8, "Rakesh"));
	list.add(new Employee1(11, "Ram"));
	list.add(new Employee1(3, "Shyam"));
	Collections.sort(list,new CompareById());
	list.forEach((emp)->{
		System.out.println(emp);
	});
	System.out.println("---------------------------------------");
	List<Employee1> list1 = new ArrayList<>(list);
	//Collections.sort(list1,new CompareByName());
	Collections.sort(list1,(a,b)->a.getName().compareTo(b.getName()));
	list1.forEach((e)->{
		System.out.println(e);
	});
}
}
