package com.example.InterviewCoding2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfWord2 {
	
	public static Map<String,Integer> getFrequencyOfEachWord(String[] array){
		Map<String, Integer> map = new HashMap<>();
		List<String> list =Arrays.asList(array);
		for(String str : array) {
			map.putIfAbsent(str, Collections.frequency(list, str));
		}
		return map;
	}
	public static void main(String[] args) {
        String[] array = {"UPI","IMPS","AEPS","UPI","UPI","BBPS","AEPS","AEPS"};
        Map<String, Integer> map = getFrequencyOfEachWord(array);
        System.out.println(map);
	}
}
