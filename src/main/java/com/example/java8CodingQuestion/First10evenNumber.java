package com.example.java8CodingQuestion;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First10evenNumber {
public static void main(String[] args) {
	//IntStream.rangeClosed(1, 10).map(i->i*2).forEach(System.out::println);
	
	 Stream.iterate(1, n->n+1).limit(10).map(i->i*2).forEach(System.out::println);
	//System.out.println(stream);
	 
	  
}
}
