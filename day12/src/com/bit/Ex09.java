package com.bit;

public class Ex09 {

	public static void main(String[] args) {
		Number num1=new Integer(1234);
		Number num2=new Double(3.14);
		System.out.println(func(4, 2));
		System.out.println(func(5, 2));
		
	}
	public static Number func(int a,int b) {
		if(a%b==0)return a/b;
		return 1.0*a/b;
	}

}
