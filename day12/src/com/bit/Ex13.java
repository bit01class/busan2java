package com.bit;

class MyErr extends Exception{
	MyErr(){
		super("내가 정한 메시지");
	}
}

public class Ex13 {

	public static void main(String[] args) {
		try {
		func(4,0);
		}catch (Exception e) {
			e.printStackTrace();
//		} catch (java.lang.ArithmeticException e) {
//			System.out.println("던진 에러받아서 처리");
		}
	}
	
	public static void func(int a, int b){
//		if(a/b==1) {
//			MyErr err=new MyErr();
//			throw err;
//		}
		int su=a/b;
		
	}

}
