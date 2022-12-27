package com.bit;

public class Ex06 extends Thread {
	
	@Override
	public void run() {
		Thread thr=this;
		System.out.println(thr.getName());
		System.out.println(this.getName());
		System.out.println(getName());
		Thread thr2=Thread.currentThread();
		System.out.println(thr2==this);
	}

	public static void main(String[] args) {
		Ex06 me=new Ex06();
		me.start();
	}

}
