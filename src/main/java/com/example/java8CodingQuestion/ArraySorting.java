package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Emp{
   private int id;
   private String name;
   private int age;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Emp(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
}


   
}
class SortByAge implements Comparator<Emp>{

	 
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

	 
	
}
public class ArraySorting {
public static void main(String[] args) {
	
	//List<Integer> ll = Arrays.asList(2,4,3,7,4,8,5);
	
	 //ll.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	
	Emp emp = new Emp(1, "Rabi", 27);
	Emp emp1 = new Emp(4, "Kolia", 23);
	Emp emp2 = new Emp(3, "Himansu", 24);
	Emp emp3 = new Emp(2, "Amol", 26);
	Emp emp4 = new Emp(5, "Sandesh", 30);
	
	List<Emp> obj = Arrays.asList(emp,emp1,emp2,emp3,emp4);
	
	//Collections.sort(obj,new SortByAge());
	Collections.sort(obj,(a,b)->b.getAge()-a.getAge());
	obj.forEach((e)->{
		System.out.println(e);
	});
	
	
	 
}
}
