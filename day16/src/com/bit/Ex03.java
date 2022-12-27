package com.bit;

import java.util.LinkedList;
import java.util.List;

public class Ex03 implements Runnable {

	public static void main(String[] args) {
		Thread thr2=new Thread(new Ex03());
		thr2.start();
		Thread thr=Thread.currentThread();
		String name=thr.getName();
		System.out.println(name+" start..");
		List list=new LinkedList();
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		System.out.println(name+" end..");
	}

	@Override
	public void run() {
		Thread thr=Thread.currentThread();
		String name=thr.getName();
		System.out.println(name+" start...");
		List list=new LinkedList();
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		System.out.println(name+" end...");		
	}

}
