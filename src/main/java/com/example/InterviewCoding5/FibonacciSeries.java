package com.example.InterviewCoding5;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int first = 0, second = 1;
		System.out.print("Fibonacci Series: " + first + ", " + second);
		for (int i = 3; i <= n; i++) {
			int next = first + second;
			System.out.print(", " + next);

			// Update the variables for the next iteration
			first = second;
			second = next;
		}

	}

}
