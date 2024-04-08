package com.example.InterviewCoding1;

import java.util.Arrays;

public class AnnagramProgram1 {

	public static String checkAnnagram(String str1, String str2) {
		char[] first = str1.toCharArray();
		char[] second = str2.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		 
         if(Arrays.equals(first, second))
        	 return "Two string are annagram";
         else
        	 return "Two string are not annagram";
	}

	public static void main(String[] args) {
		String str1 = "abdc";
		String str2 = "cadb";

		String checkAnnagram = checkAnnagram(str1, str2);
		System.out.println(checkAnnagram);
	}
}
