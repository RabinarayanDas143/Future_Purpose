package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CommonElementTwoAray {
public static void main(String[] args) {
	List<Integer> list1= Arrays.asList(2,3,4,5,6,7,8);
	List<Integer> list2=Arrays.asList(2,4,6,8,9,10);
	Predicate<Integer> p=e->list2.contains(e);
	list1.stream().filter(p).forEach(System.out::println);
}
}
