package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringareAnnagram {
	public static String checkAnnagram(String str1, String str2) {
		str1 = Arrays.stream(str1.split("")).map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());
		String result = str1.equals(str2) ? "Two Strings are Annagram" : "Two Strings are not annagram";
		return result;
	}

	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "carRace";

		String checkAnnagram = checkAnnagram(str1, str2);
		System.out.println(checkAnnagram);
	}
}
