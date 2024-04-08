package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAccordingtoLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "React", "C", "C++", ".Net");

		List<String> sortedList = list.stream().sorted((a, b) -> a.length() - b.length()).collect(Collectors.toList());
		// System.out.println(sortedList);

		list.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);

	}
}
