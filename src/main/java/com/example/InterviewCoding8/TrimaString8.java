package com.example.InterviewCoding8;

public class TrimaString8 {

	public static void main(String[] args) {
        String str = "Rabinarayan Das";
        String result = str.substring(0,4).concat("....").trim();
        System.out.println(result);
	}

}
