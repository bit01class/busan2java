package com.bit;

public class Ex07 implements Runnable{
	
	@Override
	public void run() {
		func();
	}
	
	public static void func() {
		Thread thr=Thread.currentThread();
		System.out.println(thr.getName());
	}

	public static void main(String[] args) {
		func();
		Ex07 me=new Ex07();
		Thread thr=new Thread(me);
		thr.start();
	}

}
