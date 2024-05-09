package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringareAnnagram2 {

	public static String checkStringAnnagram(String str1, String str2) {
		str1 = Arrays.stream(str1.split("")).sorted().map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).sorted().map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());
		if (str1.equals(str2))
			return "Two strings are annagram .";
		else
			return "Two strings are not annagram .";
	}

	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "carRace";

		String result = checkStringAnnagram(str1, str2);
		System.out.println(result);
	}
}
