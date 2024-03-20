package com.example.coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestFrequencyChar {

	public static char highestFrequencyChar(String input) {
		if (input == null || input.isEmpty())
			throw new IllegalArgumentException("Input String is null or empty");

		char[] charr = input.toCharArray();

		Map<Character, Integer> frequency = new HashMap<>();

		List<Character> charlist = new ArrayList<>();

		for (char ch : charr) {
			charlist.add(ch);
		}
		System.out.println(charlist);
		for (char j : charlist) {
			frequency.putIfAbsent(j, Collections.frequency(charlist, j));
		}
		char characterFrequency=0;
		int frequencynum = 0;
		
		for(Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			if(entry.getValue()>frequencynum) {
				characterFrequency = entry.getKey();
				frequencynum = entry.getValue();
			}
		}
		
		
		System.out.println(frequency);
		System.out.println(frequency.size());
		

		return characterFrequency;
	}

	public static void main(String[] args) {
		 char charr = highestFrequencyChar("Rabinarayan Das");
		 System.out.println(charr);
	}
}
