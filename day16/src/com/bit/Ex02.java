package com.bit;

public class Ex02 extends Thread {
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("새로운 쓰레드"
					+name+"로 작업 시킵니다");
	}

	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		System.out.println(name+" start");
		Ex02 thr=new Ex02();
		thr.start();
		for(int i=0; i<10; i++) {
			System.out.println(name+" work!");
		}
		System.out.println(name+" end");
	}

}
