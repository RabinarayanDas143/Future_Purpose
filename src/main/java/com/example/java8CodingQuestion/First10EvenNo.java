package com.example.java8CodingQuestion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class First10EvenNo {
	public static void main(String[] args) {
		List<Integer> evennum = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(evennum);
	}
}
