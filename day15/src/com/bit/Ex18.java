package com.bit;

import java.util.StringTokenizer;

public class Ex18 {

	public static void main(String[] args) {
		String target="java,web,,,DB,Framework";
//		String[] arr1=target.split(",");
//		System.out.println(arr1.length);
//		for(int i=0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		StringTokenizer stk;
		stk=new StringTokenizer(target,",");
		System.out.println(stk.countTokens());
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}

}







