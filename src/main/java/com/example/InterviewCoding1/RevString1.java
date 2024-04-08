package com.example.InterviewCoding1;

public class RevString1 {
	
	public static String getRevString(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i= str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "Rabinarayana Das";
		String revString = getRevString(str);
		System.out.println(revString);
	}
}
