package com.example.InterviewCoding2;

public class PalindromString2 {
	
	public static String checkPalindrom(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		if(str.equalsIgnoreCase(sb.toString())) {
			return "Given String are equeals";
		}else {
			return "Given String are not equeals";
		}
	}
	public static void main(String[] args) {
		String str = "LEVEL";
		String checkPalindom = checkPalindrom(str);
		System.out.println(checkPalindom);
	}

}
