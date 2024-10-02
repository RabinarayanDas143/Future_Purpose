package com.example.InterviewCoding9;

import java.util.Arrays;

public class BubbleSort9 {

	private static BubbleSort9 obj = null;

	private BubbleSort9() {
		if (obj != null) {
			throw new RuntimeException("Violence the Singleton rule");
		}
	}

	public static BubbleSort9 getInstatnce() {
		if (obj == null) {
			synchronized (BubbleSort9.class) {
				if (obj == null) {
					obj = new BubbleSort9();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		BubbleSort9 obj = getInstatnce();
		int[] arraysortinforLoop = obj.arraySortInForloop(array);
		//System.out.println(Arrays.toString(arraysortinforLoop));
		int[] arraySortinDoWhileLoop = obj.arraySortinDoWhileLoop(array);
		System.out.println(Arrays.toString(arraySortinDoWhileLoop));
	}

	private int[] arraySortinDoWhileLoop(int[] array) {
		boolean swapped;
		do {
			swapped=false;
			for(int i=0;i<array.length-1;i++) {
				if(array[i]>array[i+1]) {
					array[i]=array[i]+array[i+1];
					array[i+1]=array[i]-array[i+1];
					array[i]=array[i]-array[i+1];
					swapped=true;
				}
			}
		}while(swapped);
		return array;
	}

	private int[] arraySortInForloop(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		return array;
	}

}
