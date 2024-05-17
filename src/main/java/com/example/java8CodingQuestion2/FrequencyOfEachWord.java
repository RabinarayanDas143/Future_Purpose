package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {
	public static void main(String[] args) {
      String[] array = {"Java","React","java","Python","Java"};
      Map<String, Long> map = Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      for(Entry<String, Long> entry : map.entrySet()) {
    	  System.out.println(entry.getKey()+"---->"+entry.getValue());
      }
	}
}
