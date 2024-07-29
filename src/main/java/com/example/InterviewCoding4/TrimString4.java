package com.example.InterviewCoding4;

public class TrimString4 {
	public static void main(String[] args) {
        String str = "Rabinarayan Das";
        String result = getTrim(str);
        System.out.println(result);
	}

	private static String getTrim(String str) {
		 String result = str.substring(0, 4)+"...";
		return result;
	}
}
