package com.bit;

public class Ex05 {

	public static void main(String[] args) {
		// 문자들의 집합
		String st1;
		//st1="문자열";
//		st1=null;	//객체가 없음
		st1="문자열";		//객체 있음, 문자가 없음
		String st2=new String("문자열");
		String st3="문자열";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		String st4=sc.nextLine();
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
	}

}
