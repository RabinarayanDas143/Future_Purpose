package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateCharFromString6 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Set<String> set = new HashSet<>();
		List<String> duplicatechar = Arrays.stream(str.split("")).filter(e -> !set.add(e)).collect(Collectors.toList());
		System.out.println(duplicatechar);
	}

}
