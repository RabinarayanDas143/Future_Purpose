package com.example.InterviewCoding;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueElementFromArray {
	
	public static List<Integer> getUniqueElement(int[] array) {
		List<Integer> list = new ArrayList<>();
		int res = array[0];
		for(int i=1;i<array.length;i++) {
			res=res^array[i];
			//System.out.println(res);
		}
		System.out.println(res);
		 
		return list;
	}
	public static void main(String[] args) {
       int[] array = {1,5,2,3,5,2,1,4,4};
       List<Integer> uniqueElement = getUniqueElement(array);
       System.out.println(uniqueElement);
	}
}
