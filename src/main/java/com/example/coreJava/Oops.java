package com.example.coreJava;

public class Oops {
	
	static String Employee_name;
	static float Employee_salary;
	
	static void set(String name,float salary) {
		Employee_name = name;
		Employee_salary = salary;
	}
	
	static void get() {
		System.out.println("Employee name is :"+Employee_name);
		System.out.println("Empoyee salary is :"+Employee_salary);
	}
	
	public static void main(String [] args) {
		Oops.set("Rabinarayan Das", 20900.0f);
		Oops.get();
	}

}
