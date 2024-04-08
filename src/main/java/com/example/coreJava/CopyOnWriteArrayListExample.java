package com.example.coreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

//		Iterator<String> itr = list.iterator();
//
//		while (itr.hasNext()) {
//			String str = itr.next();
//
//			if (str.equalsIgnoreCase("two")) {
//				list.remove("two");
//			}
//			System.out.println(str);
//		}
		
		List<String> copyList = new CopyOnWriteArrayList<>();
		copyList.add("One");
		copyList.add("Two");
		copyList.add("Three");
		copyList.add("Four");
		
		Iterator<String> itr = copyList.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			
			if(str.equalsIgnoreCase("two")) {
				copyList.remove("Two");
			}
		}
		System.out.println(copyList);
	}
}
