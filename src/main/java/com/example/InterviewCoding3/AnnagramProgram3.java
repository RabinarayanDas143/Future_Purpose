package com.example.InterviewCoding3;

import java.util.Arrays;

public class AnnagramProgram3 {

	public static String checkAnnagram(String str1, String str2) {
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        if(Arrays.equals(str1Array, str2Array)) {
        	return "Two strings are annagram";
        }else {
        	
        	return "Two strings are not annagram";
        }
	}

	public static void main(String[] args) {
		String str1 = "adcbe", str2 = "cbda";
		String result = checkAnnagram(str1, str2);
		System.out.println(result);
	}
}
