package com.example.InterviewCoding2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEachChar2 {
	
	public static Map<Character, Integer> getFrequencyUsingMap(String str){
		
		char[] charArray = str.toCharArray();
		List<Character> listch = new ArrayList<>();
		for(char c:charArray) {
			listch.add(c);
		}
		Map<Character, Integer> map = new HashMap<>();
		for(char c :listch) {
			map.putIfAbsent(c, Collections.frequency(listch, c));
		}
		return map;
	}
	
	public static Map<Character, Integer> freqWithOutMap(String str){
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		int i,j;
		for(i=0;i<charArray.length;i++) {
			int counter =1;
			for(j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					counter++;
				}else {
					break;
				}
			}
			i=j-1;
			map.put(charArray[i], counter);
		}
		return map;
	}
	
	public static void main(String[] args) {
       String str = "I am Java Developer";
       Map<Character, Integer> frqMap = getFrequencyUsingMap(str);
       System.out.println(frqMap);
       
       Map<Character, Integer> frqWithoutMap=freqWithOutMap(str);
       System.out.println(frqWithoutMap);
	}
}
