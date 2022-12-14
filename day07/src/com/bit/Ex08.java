package com.bit;

public class Ex08 {

	public static void main(String[] args) {
		String msg1="abcd";
		char[] arr1=msg1.toCharArray();
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		char[] arr2=new char[4];
		arr2[0]='A';
		arr2[1]='B';
		arr2[2]='C';
		arr2[3]='D';
		String msg2=new String(arr2);
		System.out.println(msg2);
	}

}
