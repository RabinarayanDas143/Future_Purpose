package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElement {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(111,222,333,111,222,444);
	Set<Integer> uniqueElement = new HashSet<>();
	Set<Integer> duplicateElement = list.stream().filter(i->!uniqueElement.add(i)).collect(Collectors.toSet());
	System.out.println(duplicateElement);
}
}
