package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {

	public static Map<Character, Long> getFrequencyOfEach(String str) {
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return map;
	}

	public static void main(String[] args) {
		String str = "Java Concept of the Day !!";
		Map<Character, Long> frequency = getFrequencyOfEach(str);
		System.out.println(frequency);
	}
}
