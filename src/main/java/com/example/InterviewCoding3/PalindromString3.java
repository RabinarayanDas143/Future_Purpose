package com.example.InterviewCoding3;

public class PalindromString3 {
	public static void main(String[] args) {
      String str ="LEVEL";
      String paliResult = checkStringPalindrom(str);
      System.out.println(paliResult);
	}

	private static String checkStringPalindrom(String str) {
		String result=null;
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		if(str.equalsIgnoreCase(sb.toString())) {
			result="Given string is palindrom";
		}else {
			result="Given string is not palindrom";
		}
		return result;
	}
}
