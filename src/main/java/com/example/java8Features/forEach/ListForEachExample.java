package com.example.java8Features.forEach;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class ListForEachExample {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Rabi", 26));
		list.add(new Person("Ram", 20));
		list.add(new Person("shyam", 22));
		list.add(new Person("Hari", 30));
		list.add(new Person("Krishna", 23));
		
		// forEach using lambda expression
		list.forEach((person)->{
			//System.out.println(person.getName());
			//System.out.println(person.getAge());
		});
		
		// forEach using stream api
		
		list.stream().forEach((person)->{
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
	}
}
