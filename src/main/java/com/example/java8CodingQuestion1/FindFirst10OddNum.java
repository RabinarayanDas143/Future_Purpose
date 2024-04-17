package com.example.java8CodingQuestion1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10OddNum {
	public static List<Integer> get10OddNum() {
		List<Integer> list = Stream.iterate(1, i -> i + 1).limit(10).filter(i -> i % 2 != 0)
				.collect(Collectors.toList());
		return list;
	}

	public static void main(String[] args) {
		List<Integer> oddNum = get10OddNum();
		System.out.println(oddNum);
	}
}
