package com.example.java8Features.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
	public static void main(String[] args) {
		// create a stream
		Stream<String> stream = Stream.of("a", "b", "c", "d");
        stream.forEach(System.out::print);
        
        // create stream from source
        Collection<String> source = Arrays.asList("java","hibernate","mysql","Ajax");
        Stream<String> stream1 = source.stream();
        stream1.forEach(System.out::println);
        
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);
        
        String[] string = {"a","b","c","d","e"};
        Stream<String> stream3  = Arrays.stream(string);
        stream3.forEach(System.out::println);
	}
}
