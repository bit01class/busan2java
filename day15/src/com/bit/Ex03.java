package com.bit;

class Outter03{
	static int su1=1111;
	int su2=2222;
	
	class Inner03{
		final static int su3=3333;
		int su4=4444;
		Inner03(){}
//		static void func03() {}
		void func04(){
//			System.out.println(su1);
//			System.out.println(su2);
//			func01();
//			func02();
		}
	}
	
	Outter03(){}
		
	static void func01() {
//		System.out.println(Inner03.su3);
//		Outter03 outt=new Outter03();
//		Inner03 inn=outt.new Inner03();
//		System.out.println(inn.su4);
//		inn.func04();
	}
	void func02() {
//		System.out.println(Inner03.su3);
//		Inner03 inn=new Inner03();
//		System.out.println(inn.su4);
//		inn.func04();
	}
}


public class Ex03 {

	public static void main(String[] args) {
		////
		System.out.println(Outter03.Inner03.su3);
		Outter03 outt=new Outter03();
		Outter03.Inner03 inn;
		inn=outt.new Inner03();
		System.out.println(inn.su4);
		inn.func04();
	}

}







