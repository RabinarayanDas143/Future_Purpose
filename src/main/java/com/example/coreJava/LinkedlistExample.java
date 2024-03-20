package com.example.coreJava;

import java.util.LinkedList;

public class LinkedlistExample {
	static public void main(String args []) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		System.out.println(ll);
		
		ll.add(0, "e");
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println(ll);
	}
}
