package com.bit;

public class Ex01 {

	public static void main(String[] args) {
		// 로또 1~45 6개
		System.out.println("로또번호생성기(ver 0.1.0)");
//		0<=ran <1
//		0*45<=ran <1*45
//		0*45+1<=ran <1*45+1
		int su=45;
		int[] lotto= new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*su)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {i--;break;}
			}
		}
		
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1;j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}

}





