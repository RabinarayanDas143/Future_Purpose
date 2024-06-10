package com.example.InterviewCoding3;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateFromArray3 {
	public static void main(String[] args) {
        int[] array = {1,2,3,5,4,3,6,7,6,9,8,10,3,};
        List<Integer> duplicateNumber = findDuplicateNumber(array);
        System.out.println(duplicateNumber);
	}

	private static List<Integer> findDuplicateNumber(int[] array) {
		 List<Integer> list = new ArrayList<>();
		 for(int i=0;i<array.length;i++) {
			 for(int j=i+1;j<array.length;j++) {
				 if(array[i]==array[j] && i!=j) {
					 if(!list.contains(array[i])) {
						 list.add(array[i]);
					 }
				 }
			 }
		 }
		return list;
	}
}
