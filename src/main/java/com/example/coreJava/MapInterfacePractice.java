package com.example.coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfacePractice {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		map.put(2, "javascript");
		map.put(3, "React");
		map.put(4, "Html");

		for (Map.Entry<Integer, String> me : map.entrySet()) {
			// System.out.println(me.getKey() +" "+ me.getValue());
		}

		map.put(3, "React.Js");
		map.forEach((k, v) -> {
			// System.out.println(k + ":" + v);
		});

		Map<Integer, String> linkMap = new LinkedHashMap<>();
		linkMap.put(1, "Rabi");
		linkMap.put(2, "Ram");
		linkMap.put(3, "shyam");
		linkMap.put(4, "kesab");

		for (Map.Entry<Integer, String> obj : linkMap.entrySet()) {
			// System.out.println(obj.getKey() +":"+ obj.getValue());
		}

		linkMap.forEach((k, v) -> {
			// System.out.println(k + ":" + v);
		});

		Map<Integer, String> Tmap = new TreeMap<>();
		Tmap.put(10, "Odisha");
		Tmap.put(8, "Kolkata");
		Tmap.put(9, "Mumbai");
		Tmap.put(7, "Pune");
		Tmap.put(4, "Banglore");

		for (Map.Entry<Integer, String> treemap : Tmap.entrySet()) {
			// System.out.println(treemap.getKey() + ":" + treemap.getValue());
		}

		int[] intArray = { 1, 2, 4, 2, 5, 6, 7, 7, 5, 7, 1, 1, 9, 3, 2, 2, 3, 3 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < intArray.length; i++) {
			list.add(intArray[i]);
		}
		Map<Integer, Integer> intMap = new HashMap<>();
		for (int j = 0; j < list.size(); j++) {
			// intMap.putIfAbsent(list.get(j), Collections.frequency(list,list.get(j)));
		}
		// System.out.println(intMap);
		for (Integer ll : list) {
			intMap.putIfAbsent(ll, Collections.frequency(list, ll));
		}
		// System.out.println(intMap);

		HashMap<Integer, String> mp = new HashMap<>();
		mp.put(1, "Rabi");
		mp.put(2, "Raja");
		mp.put(1, "Ram");

		mp.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});

	}
}
