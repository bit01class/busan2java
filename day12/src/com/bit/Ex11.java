package com.bit;

public class Ex11 {

	public static void main(String[] args) {
		StringBuilder st1=new StringBuilder("java");
		st1.append(1111);
		st1.insert(4, "Web");
		st1.insert(0, 2222);
		st1.replace(4, 8, "JAVA");
		st1.delete(4, 8);
		System.out.println(st1);
		st1.reverse();
		System.out.println(st1);

	}

}
