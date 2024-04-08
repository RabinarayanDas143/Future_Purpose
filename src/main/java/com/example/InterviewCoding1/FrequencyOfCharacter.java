package com.example.InterviewCoding1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
       String str = "I am a java Developer";
       
       char[] charArray = str.toCharArray();
       
       List<Character> list = new ArrayList<>();
       for(char c: charArray) {
    	   list.add(c);
       }
       Map<Character, Integer> map = new HashMap<>();
       for(char c: charArray) {
    	   map.putIfAbsent(c, Collections.frequency(list, c));
       }
       System.out.println(map);
	}
}
