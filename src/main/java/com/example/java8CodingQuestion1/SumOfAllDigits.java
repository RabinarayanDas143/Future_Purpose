package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigits {
	public static int getSumOfAllDigits(String str) {
		int result = Arrays.stream(str.split("")).collect(Collectors.summingInt(e->Integer.parseInt(e)));
		return result;
	}
	public static void main(String[] args) {
        String str = "123";
        int result = getSumOfAllDigits(str);
        System.out.println(result);
	}
}
