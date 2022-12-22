package com.bit;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		java.util.List list;
		list=new ArrayList();
		list=new LinkedList();
		java.util.Queue que;
		que=new LinkedList();
		que.offer(1111);
		que.offer(2222);
		que.offer(3333);
		que.offer(4444);
		while(que.peek()!=null) {
			System.out.println(que.peek());
			que.poll();
		}
//		while(que.peek()!=null) {
//			System.out.println(que.poll());
//		}
		
//		que.poll();
//		System.out.println(que.peek());
//		System.out.println(que.peek());
//		System.out.println(que.peek());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
//		System.out.println(que.poll());
	}

}








