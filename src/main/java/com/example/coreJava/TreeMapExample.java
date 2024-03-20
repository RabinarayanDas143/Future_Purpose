package com.example.coreJava;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> mp = new TreeMap<String, Integer>();
		mp.put("1", 1);
		mp.put(null, 2);

		for (Entry<String, Integer> map : mp.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}
	}
}
