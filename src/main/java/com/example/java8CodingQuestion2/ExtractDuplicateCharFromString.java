package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateCharFromString {
	
	public static List<String> getDuplicateChar(String str) {
		Set<String> set = new HashSet<>();
		List<String>list = Arrays.stream(str.split("")).filter(e->!set.add(e))
				.collect(Collectors.toList());
		return list;
	}
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		List<String> array = getDuplicateChar(str);
		System.out.println(array);
	}
}
