package com.example.InterviewCoding;

public class LargestNoArray {
public static void main(String[] args) {
	int[] intArray= {2,4,6,8,9,10,55};
	int min=intArray[0];
	int max=intArray[0];
	
	for(int i=0;i<intArray.length;i++) {
		if(intArray[i]>max) {
			max=intArray[i];
		}else if(intArray[i]<min) {
			min=intArray[i];
		}
	}
	System.out.println("grater no is "+max);
	System.out.println("smaller no is "+min);
}
}
