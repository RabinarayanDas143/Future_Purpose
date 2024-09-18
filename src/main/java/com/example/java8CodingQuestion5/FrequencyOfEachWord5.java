package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord5 {

	public static void main(String[] args) {
		String[] array = { "java", "React", "java", "python", "Mysql", "React" };
		Map<String, Long> map = Arrays.stream(array)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

}
