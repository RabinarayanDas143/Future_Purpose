package com.example.InterviewCoding;

import java.util.ArrayList;
import java.util.List;

public class IterateListOfList {
	public static void main(String[] args) {
		List<List<Object>> listOfLists = new ArrayList<>();

		// Populate the list with lists of objects
		List<Object> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");

		List<Object> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		List<Object> list3 = new ArrayList<>();
		list3.add(true);
		list3.add(false);
		list3.add(true);

		listOfLists.add(list1);
		listOfLists.add(list2);
		listOfLists.add(list3);
		System.out.println("==="+listOfLists);
		// Iterate through the list of lists
		for (List<Object> list : listOfLists) {
			// Iterate through each sublist
			for (Object element : list) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
