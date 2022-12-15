package com.bit;

public class Ex01 {

	public static void main(String[] args) {
		String msg1="문자열";
		String msg2="문자";
		String msg3="열";
		String msg4=msg2+msg3;
		String msg5="문자"+"열";
		String msg6="문자".concat("열");
		System.out.println(msg6);
		System.out.println(msg1==msg5);
		System.out.println(msg1==msg6);
		String st1=new String();
		
		char[] arr= {'a','b','c','d'};
		String st2=new String(arr,0,3);
		String st3=new String("문자열");
		

	}

}







