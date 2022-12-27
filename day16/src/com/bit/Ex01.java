package com.bit;

public class Ex01 {
	public static void func() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public void func2() {
		System.out.println(Thread.currentThread().getName());				
	}

	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(Thread.currentThread().getName());
		func();
		new Ex01().func2();
		System.out.println("main end");
	}

}
