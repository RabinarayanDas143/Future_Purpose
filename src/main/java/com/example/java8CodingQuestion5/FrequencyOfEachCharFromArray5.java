package com.example.java8CodingQuestion5;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharFromArray5 {

	public static void main(String[] args) {
		char[] charArray = { 'a', 'c', 'e', 'c', 'a' };
		Map<Character, Long> frequencyMap = new String(charArray).chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
	}

}
