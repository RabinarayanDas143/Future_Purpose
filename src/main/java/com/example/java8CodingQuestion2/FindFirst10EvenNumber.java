package com.example.java8CodingQuestion2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenNumber {
	
	public static List<Integer> getFirst10EvenNumber() {
		 int[] array = new int[10];
		 List<Integer>list = Stream.iterate(1, i->i+1).limit(10).filter(i->i%2==0)
				.collect(Collectors.toList());
		 array=Stream.iterate(1, i->i+1).limit(10).filter(i->i%2==0)
			.collect(Collectors.toList()).stream().mapToInt(i->i.intValue()).toArray();
		return list;
	}
	public static void main(String[] args) {
       List<Integer> first10EvenNumber = getFirst10EvenNumber();
       System.out.println(first10EvenNumber);
	}
}
