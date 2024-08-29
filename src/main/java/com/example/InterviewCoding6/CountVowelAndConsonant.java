package com.example.InterviewCoding6;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		String str = "Hello I am a JavaDeveloper !!";
		int vowel = 0, consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char input = str.toLowerCase().charAt(i);
			if (input != ' ') {
				if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
					vowel++;
				} else {
					consonant++;
				}
			}
		}
		System.out.println("Vowel count is :" + vowel + " and Consonant is :" + consonant);
	}

}
