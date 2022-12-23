package com.bit;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add(4444);
		
		for(int i=0; i<arr.size(); i++) {
			int obj=arr.get(i);
			System.out.println(obj+"입니다");
		}
		
		Map<String,Integer> map=new HashMap<String,Integer>();
	}

}
