package com.example.java8CodingQuestion;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SunOfAllDigit {
public static void main(String[] args) {
	int i=1236556685;
	
	int sum=Stream.of(String.valueOf(i).split(""))
			.collect(Collectors.summingInt((e)->Integer.parseInt(e)));
	System.out.println(sum);
	
	String str="123";
	
	int strsum= Stream.of(str.split(""))
			    .collect(Collectors.summingInt((e)->Integer.parseInt(e)));
	System.out.println(strsum);
}
}
