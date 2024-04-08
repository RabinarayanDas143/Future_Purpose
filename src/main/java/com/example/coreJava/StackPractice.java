package com.example.coreJava;

import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		
		Stack st = new Stack<>();
		st.push("Rabi");
		st.push("Hemant");
		st.push("Aman");
		st.push("Alok");
		
		System.out.println(st);
		System.out.println(st.pop()); // it return the last element from the stack and also remove from the satck
		System.out.println(st.peek()); // it return the last element from the stack and not remove from the stack 
		System.out.println(st.search("Rabi")); // it give the index value from the stack
		System.out.println(st.empty()); // it give the boolean value on the basis of stack
		System.out.println(st);
	}
}
