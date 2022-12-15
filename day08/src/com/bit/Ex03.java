package com.bit;

import java.io.UnsupportedEncodingException;

public class Ex03 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg1="문자"+"열";
		String msg2="문자".concat("열");
		// 레퍼런스 비교
		System.out.println(msg1==msg2);
		// 값 비교
		System.out.println(msg1.equals(msg2));
		byte[] arr1=msg1.getBytes();
		char[] arr2=msg1.toCharArray();
		char[] arr3= {'a','b','c','d','e'};
		msg1.getChars(0, 2, arr3, 1);
		System.out.println(new String(arr3));
		System.out.println(msg1.length());
		System.out.println(msg1.toString());
	}

}
