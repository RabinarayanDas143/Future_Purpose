package com.example.java8Features.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {
public static void main(String[] args) {
	Map<Integer, Person> map = new HashMap<>();
	map.put(1, new Person("Rabi", 26));
	map.put(2, new Person("Ram", 28));
	map.put(3, new Person("shyam", 30));
	map.put(4, new Person("Hari", 27));
	map.put(5, new Person("krishna", 15));
	
	// use normal for each loop
	
	for(Entry<Integer, Person> entry : map.entrySet()) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	//use lambda expression
	
	map.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v.getName() +" "+ v.getAge());
	});
	
	// use dtream
	
	
}
}
