package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfAString {
public static void main(String[] args) {
	String str = "Java Python React JavaScript";
	
	String reverseStr = Arrays.stream(str.split(" "))
			           .map((e)->new StringBuffer(e).reverse())
			           .collect(Collectors.joining(" "));
	System.out.println(reverseStr);
}
}
