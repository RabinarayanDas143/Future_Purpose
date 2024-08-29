package com.example.InterviewCoding5;

public class ReverseStringInWordBasis {
	public static void main(String[] args) {
		String str = "My name is ABC.";
		String result = reverseAndMaintainOrder(str);
		System.out.println(result);
	}

	public static String reverseAndMaintainOrder(String str) {
		String[] words = str.split(" ");
		StringBuilder finalResult = new StringBuilder();

		for (String word : words) {
			// Reverse each word and add it to the final result
			finalResult.append(new StringBuilder(word).reverse().toString()).append(" ");
		}

		// Remove the trailing space
		return finalResult.toString().trim();
	}
}
