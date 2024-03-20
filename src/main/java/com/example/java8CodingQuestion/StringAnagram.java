package com.example.java8CodingQuestion;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {
public static void main(String[] args) {
	String s1 = "RaceCar";
	String s2 = "carRaceww";
	
	s1=Stream.of(s1.split("")).map((s)->s.toUpperCase()).sorted().collect(Collectors.joining());
	s2=Stream.of(s2.split("")).map((s)->s.toUpperCase()).sorted().collect(Collectors.joining());
	
	if(s1.equals(s2)) {
		System.out.println("Two string are anagram");
	}else {
		System.out.println("Two string are not anagram");
	}
}
}
