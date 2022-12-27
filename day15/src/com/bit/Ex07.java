package com.bit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
		ArrayList<Integer> list;
		list=new ArrayList<Integer>();
		list.add(1111);
		list.add(5555);
		list.add(2222);
		list.add(4444);
		list.add(3333);
		
		////
//		list.sort((a,b)->a-b);
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		////
		Iterator<Integer> ite = list.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
	}

}
