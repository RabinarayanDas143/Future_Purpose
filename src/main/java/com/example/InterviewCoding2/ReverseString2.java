package com.example.InterviewCoding2;import java.util.Arrays;

public class ReverseString2 {

	public static String getRevString(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static String getWordRev(String str) {
		String[] splitString = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=splitString.length-1;i>=0;i--) {
			sb.append(splitString[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		String revStr = getRevString(str);
		//System.out.println(revStr);
		
		String anathorRev = getWordRev(str);
		System.out.println(anathorRev);
	}
}
