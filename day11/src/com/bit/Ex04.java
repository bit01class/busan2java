package com.bit;

public class Ex04 implements Cloneable {
	static Arr module;

	public static void main(String[] args) throws CloneNotSupportedException {
		Object obj=new Object();
		System.out.println(obj.hashCode());
//		Object obj2=obj.clone();
		Ex04 me=new Ex04();
		Object you=me;
		Ex04 you2=(Ex04)you;
		System.out.println(me==you2);
		Ex04 you3=(Ex04)me.clone();
		System.out.println(me==you3);
		int[] arr= {1,3,5,7,9};
		int[] arr2=arr.clone();
		System.out.println(arr==arr2);
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
