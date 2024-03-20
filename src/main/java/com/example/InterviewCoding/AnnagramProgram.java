package com.example.InterviewCoding;

import java.util.Arrays;

public class AnnagramProgram {
	public void checkAnnagram(String str1, String str2) {
		char[] firstStr = str1.toCharArray();
		char[] secStr = str2.toCharArray();

		Arrays.sort(firstStr);
		Arrays.sort(secStr);

		if (Arrays.equals(firstStr, secStr)) {
			System.out.println("Two word are annagram .");
		} else {
			System.out.println("Two word are not annagram");
		}
	}

	public void checkAnnagramOther(String str1, String str2) {
		char[] firstStr = str1.toCharArray();
		char[] secStr = str2.toCharArray();

		Arrays.sort(firstStr);
		Arrays.sort(secStr);
		
		str1=firstStr.toString();
		str2=secStr.toString();
		 
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Two words are Annagram .");
		}else {
			System.out.println("Two words are not annagram .");
		}
	}
	public static void main(String[] args) {
		AnnagramProgram obj = new AnnagramProgram();
		//obj.checkAnnagram("silent", "listen");
		obj.checkAnnagramOther("silent", "listen");
	}
}
