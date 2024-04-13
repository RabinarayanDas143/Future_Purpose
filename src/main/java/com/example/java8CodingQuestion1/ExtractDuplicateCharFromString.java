package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateCharFromString {
	public static List<String> getDuplicateFromString(String str) {
		Set<String> set = new HashSet<>();
		List<String> duplicateList = Arrays.stream(str.split("")).filter(e -> !set.add(e)).collect(Collectors.toList());
		return duplicateList;
	}

	public static void main(String[] args) {
		String str = "Java Concept of the day !!";
		List<String> duplicateString = getDuplicateFromString(str);
		System.out.println(duplicateString);
	}
}
