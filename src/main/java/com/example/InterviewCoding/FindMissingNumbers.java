package com.example.InterviewCoding;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
	 
	    public static void main(String[] args) {
	        String input = "1,2,4,5,9,10";
	        List<Integer> missingNumbers = findMissingNumbers(input);
	        System.out.println("Missing numbers: " + missingNumbers);
	    }

	    public static List<Integer> findMissingNumbers(String input) {
	        List<Integer> missingNumbers = new ArrayList<>();

	        // Parse the input string to extract integers
	        String[] numbersStr = input.split(",");
	        int[] numbers = new int[numbersStr.length];
	        for (int i = 0; i < numbersStr.length; i++) {
	            numbers[i] = Integer.parseInt(numbersStr[i]);
	        }

	        // Determine the range of numbers
	        int min = numbers[0];
	        int max = numbers[numbers.length - 1];

	        // Iterate over the range and check for missing numbers
	        for (int i = min + 1; i < max; i++) {
	            boolean found = false;
	            for (int j = 0; j < numbers.length; j++) {
	                if (numbers[j] == i) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                missingNumbers.add(i);
	            }
	        }

	        return missingNumbers;
	    }
	}


