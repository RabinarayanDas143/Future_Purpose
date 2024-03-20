package com.example.coreJava;

class Student {
	int rollno;
	String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class ArrayPractice {
	public static void main(String[] args) {
		Student[] student = new Student[3];

		student[0] = new Student(1, "Rabi");
		student[1] = new Student(2, "Aman");
		student[2] = new Student(3, "Alexa");
// one dimentional Array
		for (int i = 0; i < student.length; i++) {
			// System.out.println(student[i].rollno + ":" + student[i].name);
		}
// MultiDimentional Array - 2D Array
		int[][] twoDArray = { { 1, 2, 3 }, { 2, 5, 9 }, { 2, 4, 5 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//System.out.println(twoDArray[i][j]+" ");
			}
			//System.out.println();
		}
// Sum of numbers define in array
		int [] number = {1,3,5,78,3,46,7,8};
		int sum= 0;
		for(int n:number) {
			sum=sum+n;
		}
		System.out.println("sum is :"+sum);
	}

}
