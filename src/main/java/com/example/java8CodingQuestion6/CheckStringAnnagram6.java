package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringAnnagram6 {

	public static void main(String[] args) {
		String str1 = "RaceCare";
		String str2 = "carRace";

		str1 = Arrays.stream(str1.split("")).map(e -> e.toLowerCase()).sorted().collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).map(e -> e.toLowerCase()).sorted().collect(Collectors.joining());

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Two string are annagram...");
		} else {
			System.out.println("Two string are not annagram...");
		}
	}

}
