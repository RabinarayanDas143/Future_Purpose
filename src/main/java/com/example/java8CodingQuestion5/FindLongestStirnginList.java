package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.List;

public class FindLongestStirnginList {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "pear", "pineapple");
		String result = words.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(result);
	}

}
