package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordWithLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		Map<String, Integer> map = names.stream().collect(Collectors.toMap(e -> e, e -> e.length()));
		System.out.println(map);

		Map<String, Integer> map1 = names.stream().collect(Collectors.groupingBy(e -> e,
				Collectors.collectingAndThen(Collectors.toList(), e -> e.get(0).length())));
		System.out.println(map1);
		
		List<String> namess = Arrays.asList("Alice", "Bob", "Charlie", "David");

         
    

	}

}
