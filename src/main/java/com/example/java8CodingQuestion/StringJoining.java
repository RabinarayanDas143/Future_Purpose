package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Java","Python","JavaScript","React","DevOps","MySql");
	
	String joinString = list.stream().collect(Collectors.joining(",","[","]"));
	System.out.println(joinString);
}
}
