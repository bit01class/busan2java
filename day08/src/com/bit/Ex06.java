package com.bit;

public class Ex06 {

	public static void main(String[] args) {
//		String target="24148|강원도|화천군|상서면";
		String target="java,DB,,web,framework";
		System.out.println("->"+target.trim()+"<-");
//		String[] arr1=target.split("\\|");
		String[] arr1=target.split(",");
		String st1="java";
		String st2="jbvaaaa";
		System.out.println(st1.compareTo(st2));
	}

}
