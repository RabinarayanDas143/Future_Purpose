package com.example.InterviewCoding7;

public class FibonacciSeries7 {

	public static void main(String[] args) {
		int num = 10;
		int first = 0, second = 1;
		System.out.print(first + " , " + second);
		for (int i = 3; i <= num; i++) {
			int next = first + second;
			System.out.print(" , " + next);
			first = second;
			second = next;
		}
	}

}
