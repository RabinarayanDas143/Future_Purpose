package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringAnnagram5 {

	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "carRace";
        
		str1 = Arrays.stream(str1.split("")).sorted().map(e->e.toLowerCase()).sorted().collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).sorted().map(e->e.toLowerCase()).sorted().collect(Collectors.joining());
		 
		if(str1.equals(str2)) {
			System.out.println("Two Strings are Annagram...");
		}else {
			System.out.println("Two Strings are not Annagram...");
		}
	}

}
