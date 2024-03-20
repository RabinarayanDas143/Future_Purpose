package com.example.InterviewCoding;

import java.util.Map;
import java.util.Map.Entry;

public class HashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new java.util.HashMap<>();
		map.put(1, "Rabi");
		map.put(2, "RAja");
		map.put(3, "Nanduli");
		map.put(4, "Shyam");

		// java 7
		for (Entry<Integer, String> entry : map.entrySet()) {
			// System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		// java 8
		map.forEach((k, v) -> {
			// System.out.println(k + ":" + v);
		});

		map.put(3, "sibani");

		map.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
	}
}
