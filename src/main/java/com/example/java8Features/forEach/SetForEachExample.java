package com.example.java8Features.forEach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForEachExample {
public static void main(String[] args) {
	Set<Person> set = new HashSet();
	set.add(new Person("Rabi", 26));
	set.add(new Person("Ram", 20));
	set.add(new Person("shyam", 22));
	set.add(new Person("Hari", 30));
	set.add(new Person("Krishna", 23));
	//using lambda
	set.forEach((per)->{
		//System.out.println(per.getName());
		//System.out.println(per.getAge());
	});
	
	set.stream().forEach((per)->{
		System.out.println(per.getName());
		System.out.println(per.getAge());
	});
}
}
