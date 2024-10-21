package com.example.java8CodingQuestion6;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharFromString6 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Long> map = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

}
