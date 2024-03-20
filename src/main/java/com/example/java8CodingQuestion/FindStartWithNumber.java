package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartWithNumber {
public static void main(String[] args) {
	List<String> listWord = Arrays.asList("Java","3Python","6React",".Net");
	List<String> output = listWord.stream().filter(e->Character.isDigit(e.charAt(0))).collect(Collectors.toList());
	System.out.println(output);
}
}
