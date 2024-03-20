package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin3Number {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(34,56,87,90,33,54,76,23,88,99);
	List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList);
	List<Integer> firstThree=list.stream().sorted().limit(3).collect(Collectors.toList());
	System.out.println(firstThree);
	List<Integer> lastThree = list.stream().sorted((a,b)->b-a).limit(3).collect(Collectors.toList());
	System.out.println(lastThree);
}
}
