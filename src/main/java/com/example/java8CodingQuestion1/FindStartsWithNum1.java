package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartsWithNum1 {
	
	public static List<String> getElementStartWithNum(String[] str){
		
		List<String> list =Arrays.stream(str).filter(e->Character.isDigit(e.charAt(0))).collect(Collectors.toList());
		return list;
	}
	public static void main(String[] args) {
        String[] str = {"Java","5ReactJs","Angular","9Html"};
        List<String> list = getElementStartWithNum(str);
        System.out.println(list);
	}
}
