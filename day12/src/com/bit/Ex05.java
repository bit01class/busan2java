package com.bit;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("시작");
		int su1=4;
		try {
			System.out.println("su1");
			int su2=1;
			int su3=su1/su2;
			System.out.println("su2");
		}catch(java.lang.ArithmeticException e) {
			
		}
		System.out.println("종료");

	}

}
