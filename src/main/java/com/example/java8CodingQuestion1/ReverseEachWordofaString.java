package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordofaString {
	
	public static String getReverseOfEachSentence(String str) {
		String revStr = Arrays.stream(str.split(" "))
				.map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		return revStr;
	}
	public static void main(String[] args) {
         String str = "Java Concept of the Day !";
         String revStr = getReverseOfEachSentence(str);
         System.out.println(revStr);
	}
}
