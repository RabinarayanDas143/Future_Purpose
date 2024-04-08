package com.example.InterviewCoding;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


class Practice {
	private static Practice practice;

//	private Practice() {
//		if (practice != null) {
//			throw new RuntimeException("violating the Singleton design pattern");
//		}
//	}

	public Practice getPracticeObj() {
		if (practice == null) {
			synchronized (practice) {
				if (practice == null) {
					practice = new Practice();
				}
			}
		}
		return practice;
	}
}

public class FailSafeExample {

	public static void main(String[] args) throws Exception {
//		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
//		List<String> newList = new ArrayList<>();
//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			String val = itr.next();
//			System.out.println(val);
//		}

		FailSafeExample obj = new FailSafeExample();
		System.out.println(obj.hashCode());

		Constructor<Practice> constructor=Practice.class.getDeclaredConstructor();
		Practice obj1 = constructor.newInstance();
		System.out.println(obj1.hashCode());
		

	}
}
