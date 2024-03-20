package com.example.java8CodingQuestion;

public class PalindromProgram {
	public static void main(String[] args) {
        String str="ROTATOR";
        
        // using java 1.7
//        StringBuffer sb = new StringBuffer();
//        for(int i=str.length()-1;i>=0;i--) {
//        	sb.append(str.charAt(i));
//        }
//        String str1=sb.toString();
//        if(str.equals(str1)) {
//        	System.out.println("String is palindrom");
//        }else {
//        	System.out.println("String is not palindrom");
//        }
        
        //using java 1.8
        System.out.println(str.length()/2);
	}
}
