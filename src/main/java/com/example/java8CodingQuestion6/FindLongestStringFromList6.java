package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.List;

public class FindLongestStringFromList6 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "pear", "pineapple");
		String longeststr = words.stream().reduce(" ", (a, b) -> a.length() > b.length() ? a : b);
		System.out.println(longeststr);
	}

}
