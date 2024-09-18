package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigists {

	public static void main(String[] args) {
		String str = "123";
		
		int sum = Arrays.stream(str.split("")).collect(Collectors.summingInt(e->Integer.parseInt(e)));
		System.out.println(sum);
	}

}
