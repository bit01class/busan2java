package com.bit;

public class Ex08 extends Thread{
	
	public Ex08() {
//		super("뉴스레드");
		setName("뉴뉴스레드");
	}
	
	@Override
	public void run() {
		Thread thr=Thread.currentThread();
//		thr.setName("새로운쓰레드");
		System.out.println(this.getName());
		System.out.println(thr.getName());
		System.out.println(thr==this);
		System.out.println(this.getId());
		System.out.println(thr.getId());
	}

	public static void main(String[] args) {
		Ex08 me=new Ex08();
		me.start();
	}

}
