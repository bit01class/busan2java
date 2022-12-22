package com.bit;

public class Ex12 {

	public static void main(String[] args) {
		int[] arr1= {-2,-1,0,1,2};
		for(int i=0; i<6; i++) {
			try {
			System.out.println(3/arr1[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
			}catch ( java.lang.ArithmeticException e) {
				System.out.println(e.toString());
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
