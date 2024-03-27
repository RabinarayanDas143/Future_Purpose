package com.example.InterviewCoding;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPractice {

	public static void main(String[] args) {
		// String name = "JavaConceptOfTheDay".substring(4);

//	    	String name = "Rabi|kolia|amol|himansu";
//	        String arr[] = name.split("\\|");
//	        String match ="kolia";

//	        for(String str : arr) {
//	        	 if(str.equalsIgnoreCase(match))
//	        		 System.out.println(str);
//	        }

		// System.out.println("1".concat("2"));

//		String str1 = new String("Java");
//		System.out.println(str1.hashCode());
//		String str2 = new String("Java");
//		System.out.println(str2.hashCode());
//		System.out.println(str1 == str2);
//
//		System.out.println(str1.equals(str2));
//
//		System.out.println(str1.hashCode() == str2.hashCode());

//		String s1="java";
//		String s2 = new String("java");
//		String s5 = new String("java");
//		String s3=s2.intern();
//		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s2==s5);

//		String s1 = "ONE";
//		s1.concat("TWO");
//		System.out.println(s1);
//
//		s1 = s1.concat("THREE");
//		System.out.println(s1);
//		System.out.println(s1);
		// System.out.println(2+3+4+'A'/'A');
		Map<Character, Long> map = "ABC123abc".chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Entry<Character, Long> mp : map.entrySet()) {
		//	System.out.println(mp.getKey() + ":" + mp.getValue());
		}

//		String str = "Java concept of the day";
//		System.out.println(str.indexOf('a'));
//		System.out.println(str.indexOf("day"));
		StringBuilder sb = new StringBuilder("0123456789");
        
//        System.out.println(sb.delete(3, 6));
//        System.out.println(sb.deleteCharAt(4));
//        System.out.println(sb.deleteCharAt(5));
		
//		String str1 = "OnE tWo ThReE fOuR";
//        
//        String str2 = "oNeTwOtHrEeFoUr";
//        System.out.println(str1.trim().equalsIgnoreCase(str2));
        
//		StringBuffer sb1 = new StringBuffer("11111");
//        
//        StringBuffer sb2 = sb1.append(22222).reverse();
//         System.out.println(sb1);
//         System.out.println(sb2);
//        System.out.println(sb1 == sb2);
         
	}
}
