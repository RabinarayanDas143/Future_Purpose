package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord2 {
	public static void main(String[] args) {
		String[] array = { "Java", "React", ".Net", "Java", "React", "Java" };
		Map<String, Long> frequency = getFrequencyOfEachString(array);
		frequency.forEach((k, v) -> System.out.println(k + "---->" + v));
	}

	private static Map<String, Long> getFrequencyOfEachString(String[] array) {
		Map<String, Long> freq = Arrays.stream(array)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return freq;
	}
}
