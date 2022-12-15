package com.bit;

public class Ex04 {

	public static void main(String[] args) {
		String st1="abcabcdefg";
		System.out.println(st1.charAt(0));
		System.out.println(st1.contains("cde"));
		System.out.println(st1.contains("CDE"));
		System.out.println(st1.startsWith("ac"));
		System.out.println(st1.endsWith("eg"));
		System.out.println(st1.indexOf('d'));
		System.out.println(st1.indexOf('a',1));
		System.out.println(st1.indexOf("bc",2));
		System.out.println("".isEmpty());
		System.out.println("".length()==0);
		System.out.println(st1.lastIndexOf('a',2));
		System.out.println(st1.indexOf('B'));
		String st2=st1.substring(3);
		System.out.println(st2);
		String st3=st1.substring(3,7);
		System.out.println(st3);
		String st4=st1.substring(9,10);
		System.out.println(st4);
		String st5=st1.replace("ABC", "abc");
		System.out.println(st5);
		System.out.println(st1);
	}

}





