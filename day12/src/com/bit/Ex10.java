package com.bit;

public class Ex10 {

	public static void main(String[] args) {
		StringBuffer st1=new StringBuffer(5);
		StringBuffer st2=new StringBuffer("java");
		StringBuffer st3=new StringBuffer("Web");
//		st2.append(st3);
//		StringBuffer st5=st2.append("Framework");
//		5
//		6+2=12
//		13*2=26
//		27*2=54
		for(int i=0; i<6; i++) {
		st1.append('a');
		st1.trimToSize();
		}
		System.out.println(st1+":"+st1.capacity());
	}

}
