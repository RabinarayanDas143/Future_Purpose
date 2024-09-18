package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Java hello";
		String revstr = Arrays.stream(str.split(" ")).map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(revstr);
	}

}
