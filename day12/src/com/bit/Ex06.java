package com.bit;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("main start");
		int su1=4;
		int[] arr= {-2,-1,0,1,2};
		
		for(int i=0; i<arr.length; i++) {
			try {
			System.out.println(su1/arr[i]);
			}catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main end");
	}

}





