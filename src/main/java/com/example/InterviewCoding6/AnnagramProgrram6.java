package com.example.InterviewCoding6;

import java.util.Arrays;

public class AnnagramProgrram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str1 = "Racecar";
       String str2 = "carRace";
       String result = checkAnnagram(str1,str2);
       System.out.println(result);
	}

	private static String checkAnnagram(String str1, String str2) {
		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if(Arrays.equals(charArray1, charArray2)) {
			return "Two String are Annagram..";
		}else {
		return "Two String are not Annagram..";
		}
	}

}
