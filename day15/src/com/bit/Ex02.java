package com.bit;

class Outter02{
	static int su1=1111;
	int su2=2222;
	
	public static class Inner02{
		static int su3=3333;
		int su4=4444;
		
		Inner02(){}
		
		static void func03() {
//			System.out.println(su1);
//			func01();
//			Outter02 outt=new Outter02();
//			System.out.println(outt.su2);
//			outt.func02();
		}
		void func04() {
//			System.out.println(su1);
//			func01();
//			Outter02 outt=new Outter02();
//			System.out.println(outt.su2);
//			outt.func02();
		}
	}
	
	Outter02(){}
	
	static void func01() {
//		Inner02 inn1=new Inner02();
//		System.out.println(Inner02.su3);
//		Inner02.func03();
//		System.out.println(inn1.su4);
//		inn1.func04();
	}
	void func02() {
//		Inner02 inn1=new Inner02();
//		System.out.println(Inner02.su3);
//		Inner02.func03();
//		System.out.println(inn1.su4);
//		inn1.func04();
	}
}


public class Ex02 {

	public static void main(String[] args) {
		System.out.println(Outter02.su1);
		Outter02.func01();
		Outter02 outt=new Outter02();
		System.out.println(outt.su2);
		outt.func02();
		///////////////////////////
//		java.util.Map.Entry e;
		System.out.println(Outter02.Inner02.su3);
		Outter02.Inner02.func03();
		Outter02.Inner02 inn=new Outter02.Inner02();
		System.out.println(inn.su4);
		inn.func04();

	}

}
