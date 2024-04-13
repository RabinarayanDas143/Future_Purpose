package com.example.java8CodingQuestion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ObjectSort {
	int id;
	String Name;
	int salary;

	
	public ObjectSort(int id, String name, int salary) {
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
		return "ObjectSort [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
	}

}

public class ObjectSorting {
	public static void main(String[] args) {
         List<ObjectSort> objList = new ArrayList<>();
         objList.add(new ObjectSort(10,"Rabi",100000));
         objList.add(new ObjectSort(20, "Aman", 8000));
         objList.add(new ObjectSort(50, "Rakesh", 90000));
         objList.add(new ObjectSort(40, "Sambhu", 5000));
         objList.add(new ObjectSort(30, "Kolia", 14000));
         
         Collections.sort(objList, (a,b)->a.getName().compareTo(b.getName()));
         objList.forEach((e)->System.out.println(e));
         
	}
}
