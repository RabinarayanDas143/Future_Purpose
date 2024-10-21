package com.example.InterviewCoding9;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromStringArray9 {

	public static void main(String[] args) {
		String[] array = { "java", "spring", "java", "react.js", "spring" };
		List<String> filterStringlist = getFilterStirngList(array);
		//System.out.println(filterStringlist);
		List<String> duplicateStringList = getDuplicateStringList(array);
		System.out.println("Duplicate Stirngs are :"+duplicateStringList);
	}

	private static List<String> getDuplicateStringList(String[] array) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equalsIgnoreCase(array[j])) {
					flag = false;
				}
			}
			if (!list.contains(array[i]) && !flag) {
				list.add(array[i]);
			}
		}
		return list;
	}

	private static List<String> getFilterStirngList(String[] array) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equalsIgnoreCase(array[j])) {
					flag = false;
				}
			}
			if (!list.contains(array[i]) && flag) {
				list.add(array[i]);
			}
		}
		return list;
	}

}
