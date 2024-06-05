package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar2 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Long> frequency = getFrequencyOfEachChar(str);
		frequency.forEach((k, v) -> System.out.println(k + "------>" + v));
	}

	private static Map<Character, Long> getFrequencyOfEachChar(String str) {
		Map<Character, Long> frequency = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return frequency;
	}
}
