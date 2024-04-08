package com.example.coreJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import jakarta.transaction.Synchronization;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		//List<String> list = Arrays.asList("one", "two", "three", "four", "five");

//       Iterator<String> itr = list.iterator();
//       while(itr.hasNext()) {
//    	   String str = itr.next();
//    	   if(str.equalsIgnoreCase("two")) {
//    		   list.remove("two");
//    	   }
//       }
//       System.out.println(list);

		List<String> list = Arrays.asList("one", "two", "three", "four", "five");
		List<String> syncList = Collections.synchronizedList(list);

		synchronized(syncList){
			Iterator<String> itr = syncList.iterator();
			while (itr.hasNext()) {
				String str = itr.next();
				if (str.equalsIgnoreCase("two")) {
					itr.remove();
				}
			}
			System.out.println(syncList);
		}
	}
}
