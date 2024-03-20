package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntDivideBy5 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(22,55,34,67,45,12,89,88,78,66,11);
	List<Integer> result =list.stream().filter((i)->i%5==0).collect(Collectors.toList());
	System.out.println("given list is multipy by 5 :"+result);
}
}
