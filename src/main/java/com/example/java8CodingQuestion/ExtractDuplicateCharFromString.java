package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateCharFromString {
public static void main(String[] args) {
	String str = "Java Concept of the day !!";
	Set<String> uniqueChar = new HashSet<>();
	Set<String> duplicateChar = Arrays.stream(str.split("")).filter(e->!uniqueChar.add(e)).collect(Collectors.toSet());
	System.out.println(duplicateChar);
}
}
