package com.bit;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex04 {

	public static void main(String[] args) {
		long before=System.currentTimeMillis();
		//4691
		java.util.ArrayList arr=new ArrayList();
		//6160
//		java.util.LinkedList arr=new LinkedList();
		for(int i=0; i<10000000; i++)
		arr.add(i);
		for(int i=0; i<arr.size(); i++) {
			Object obj=arr.get(i);
		}
		long after=System.currentTimeMillis();
		
		System.out.println(after-before);
		
//		arr.add(2222);
//		arr.add(3333);
//		arr.add(4444);
//		for(int i=0; i<arr.size(); i++) {
//			int obj=(int)arr.get(i);
//			System.out.println(obj);
//		}

	}

}
