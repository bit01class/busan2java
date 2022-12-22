package com.bit;

public class Ex05 {

	public static void main(String[] args) {
		long before=System.currentTimeMillis();
		String msg="";
		for(int i=0;i<10000; i++)
			msg+=i;
		long after=System.currentTimeMillis();
		System.out.println(after-before);
		System.out.println(before);
		System.out.println(Long.MAX_VALUE);

	}

}
