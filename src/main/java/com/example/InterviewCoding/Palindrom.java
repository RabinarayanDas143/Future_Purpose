package com.example.InterviewCoding;

public class Palindrom {
	public static void main(String[] args) {
		String str = "level";

		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
		}
		String revStr = sb.toString();
		
		if(str.equals(revStr)) {
			System.out.println("Given string is palindrom");
		}else {
			System.out.println("Given string is not palindrom");
		}
	}
}