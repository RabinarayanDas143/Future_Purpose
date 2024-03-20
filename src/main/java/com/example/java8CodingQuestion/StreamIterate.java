package com.example.java8CodingQuestion;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterate {
public static void main(String[] args) {
	Stream.iterate(0, x->x+1)
	.limit(101)
	.filter(x->x%2==0)
	.map(x->x/10)
	.distinct()
	.sorted()
	.peek(x->System.out.println(x))
	.collect(Collectors.toList());
}
}
