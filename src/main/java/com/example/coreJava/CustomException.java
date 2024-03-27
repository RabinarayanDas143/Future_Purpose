package com.example.coreJava;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CustomException {
	public static void main(String[] args) throws InvalidAgeException {
       int age =18;
       
       if(age<20) {
    	   throw new InvalidAgeException("Age is less than 20");
       }else {
    	   System.out.println("Welcom to vote");
       }
	}
}
