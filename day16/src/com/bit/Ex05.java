package com.bit;

public class Ex05 {

	public static void main(String[] args) {
		Thread thr=new Thread() {
			@Override
			public void run() {
				Thread thr=Thread.currentThread();
				String name=thr.getName();
				System.out.println(name);
			}
		};

		thr.start();
	}

}
