package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOfEachWordOfaString {
	public static void main(String[] args) {
		String str = "Java concept of the day";
		String revStr = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(revStr);
	}
}
