package com.bit;

public class Ex06 {

	public static void main(String[] args) {
		String msg1="abcd";
		byte[] arr1=msg1.getBytes();
		System.out.println(arr1.length);
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		byte[] arr2=new byte[4];
		arr2[0]=65;
		arr2[1]=66;
		arr2[2]=67;
		arr2[3]=68;
		String msg2=new String(arr2);
		System.out.println(msg2);
		
		
	}

}





