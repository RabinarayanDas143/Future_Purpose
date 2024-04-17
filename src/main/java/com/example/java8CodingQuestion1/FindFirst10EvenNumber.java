package com.example.java8CodingQuestion1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirst10EvenNumber {
	public static void main(String[] args) {
      List<Integer> list = Stream.iterate(1, i->i+1).limit(10).filter(i->i%2==0).collect(Collectors.toList());
      List<Integer> list1 = IntStream.rangeClosed(1, 10).boxed().filter(i->i%2==0).collect(Collectors.toList());
      System.out.println(list);
      System.out.println(list1);
	}
}
