package com.bit;

public class Ex07 {

	public static void main(String[] args) {
		boolean boo1=true;
		Boolean boo2=new Boolean(Boolean.TRUE);
		Boolean boo3=new Boolean("faluse");
		Boolean boo4=new Boolean("True");
		// 0-1=-1
		// 1-0=1
		System.out.println(boo3.compareTo(boo4));

	}

}
