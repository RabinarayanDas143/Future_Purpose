package com.example.coreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListExample {
	public static void main(String[] rags) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		System.out.println(list);

		List<String> list1 = new ArrayList<String>();
		list1.add("e");
		list1.add("f");
		list1.add("g");

		list.addAll(list1);
		System.out.println(list);

		list.remove(6);
		System.out.println(list);

		list.set(5, "g");
		System.out.println(list);

		list.add("a");
		list.add("b");
		System.out.println(list);
		System.out.println(list.lastIndexOf("a"));
		System.out.println(list.indexOf("e"));
		System.out.println(list.contains("e"));

//		for(String str: list) {
//			System.out.println(str + " ");
//		}
		for (int i = 0; i < list.size(); i++) {
 			System.out.print(list.get(i)+" ");
		}
	}
}
