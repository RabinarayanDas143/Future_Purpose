package com.example.java8CodingQuestion6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber6 {

	public static void main(String[] args) {
		List<Integer> list = Stream.iterate(0, n -> n + 1).limit(10).collect(Collectors.toList());
		List<Integer> even = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		System.out.println("Even no is :" + even);
		System.out.println("Odd no is :" + odd);
	}

}
