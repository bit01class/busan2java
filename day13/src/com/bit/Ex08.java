package com.bit;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		java.util.Deque que;
		que=new ArrayDeque();
		
		que.offerLast(1111);
		que.offerLast(2222);
		que.offerLast(3333);
//		que.offerFirst(1111);
//		que.offerFirst(2222);
//		que.offerFirst(3333);
//		System.out.println(que.pollLast());
//		System.out.println(que.pollLast());
//		System.out.println(que.pollLast());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
	}

}







