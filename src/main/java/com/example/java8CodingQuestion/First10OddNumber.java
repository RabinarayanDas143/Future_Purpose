package com.example.java8CodingQuestion;

import java.util.List;
import java.util.stream.IntStream;

public class First10OddNumber {
public static void main(String[] args) {
	IntStream.rangeClosed(1, 10).filter(i->i%2!=0).forEach(System.out::println);
}
}
