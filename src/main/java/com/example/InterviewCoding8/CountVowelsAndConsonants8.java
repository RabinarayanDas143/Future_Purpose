package com.example.InterviewCoding8;

public class CountVowelsAndConsonants8 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		int vowels = 0, consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("Vowels count is :" + vowels + " and Consonants is :" + consonants);
	}

}
