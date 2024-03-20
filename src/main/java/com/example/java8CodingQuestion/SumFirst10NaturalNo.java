package com.example.java8CodingQuestion;

import java.util.stream.IntStream;

public class SumFirst10NaturalNo {
public static void main(String[] args) {
	int sum=IntStream.range(1, 11).sum();
	System.out.println(sum);
}
}
