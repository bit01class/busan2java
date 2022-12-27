package com.bit;

import java.util.*;

public class Ex16 {

	public static void main(String[] args) {
		java.io.InputStream inn=System.in;
		Scanner sc;
		sc=new Scanner("12\nabc");
		System.out.println(sc.hasNextInt());
		System.out.println(sc.nextInt()+1);
		System.out.println(sc.hasNextInt());
		System.out.println(sc.nextLine()+1);
		System.out.println(sc.hasNextInt());
		System.out.println(sc.nextLine()+1);

	}

}
