package com.bit;

public class Ex11 {

	public static void main(String[] args) {
		// 순서가 없는 자료구조 - 집합
		// 1.중복을 허용하지 않는다
		// 2.순서o
		
		
		java.util.Set set1;
		set1=new java.util.HashSet();
		set1.add("첫번째");
		set1.add("두번째");
		set1.add("세번째");
		set1.add("네번째");
		set1.add("다섯번째");
		
		System.out.println(set1.remove(new String("첫번째")));
		java.util.Iterator ite;
		ite=set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
//		Object[] arr=set1.toArray();
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

}




