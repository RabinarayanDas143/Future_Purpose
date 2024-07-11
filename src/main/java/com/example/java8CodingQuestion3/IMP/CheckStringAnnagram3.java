package com.example.java8CodingQuestion3.IMP;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckStringAnnagram3 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRacei";

		String result = checkAnnagram(str1, str2);
		System.out.println(result);
	}

	private static String checkAnnagram(String str1, String str2) {
		str1 = Arrays.stream(str1.split("")).map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());
		if (str1.equals(str2)) {
			return "Two String are annagram";
		} else {
			return "Two Strings are not annagram";
		}
	}
}
