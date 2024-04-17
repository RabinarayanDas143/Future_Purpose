package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWordFromArray {

	public static Map<String, Long> FrequencyOfEachWord(String[] str) {
		Map<String, Long> map = Arrays.stream(str)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return map;
	}

	public static void main(String[] args) {
		String[] strArray = { "Rabi", "Ankit", "Naduli", "Rabi", "Rahul", "Himesh", "Rabi" };
		Map<String, Long> map = FrequencyOfEachWord(strArray);
		System.out.println(map);
	}
}
