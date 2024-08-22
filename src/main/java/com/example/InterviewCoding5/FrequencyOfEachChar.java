package com.example.InterviewCoding5;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "Rabinarayan Das";
      Map<Character, Integer> charFreq = findFrequency(str);
      System.out.println(charFreq);
	}

	private static Map<Character, Integer> findFrequency(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char value = str.charAt(i);
			if(map.containsKey(value)) {
				map.put(value, map.get(value)+1);
			}else {
				map.put(value,1);
			}
		}
		return map;
	}

}
