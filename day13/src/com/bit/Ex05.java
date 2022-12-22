package com.bit;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		LinkedList list2=new LinkedList();
		list2.add(2222);
		list2.add(3333);
		list2.add(4444);
//		list2.removeAll(list);
		list2.set(1, 5555);
		Object[] arr3=list2.toArray();
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
