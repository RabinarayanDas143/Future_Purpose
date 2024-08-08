package com.example.InterviewCoding5;

public class CountVowelAndConsontatnt {

	public static void main(String[] args) {
		String str = "Hello I am a JavaDeveloper !!";
		int vowels = 0, consonants = 0;
		String string = str.toLowerCase();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
						|| string.charAt(i) == 'o' || string.charAt(i) == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}

		}
		System.out.println("vowel is :" + vowels + "  consonants is :" + consonants);
	}

}
