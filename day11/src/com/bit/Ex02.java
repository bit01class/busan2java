package com.bit;

class Lec02{
	
//	public > protected >= default > private
	protected int su1;
	
	protected void func01() {}
}

public class Ex02 extends com.bit2.Lec22{

	public static void main(String[] args) {
		Lec02 me=new Lec02();
		System.out.println(me.su1);
		me.func01();
//		com.bit2.Lec22 you;
//		you=new com.bit2.Lec22();
//		System.out.println(you.su1);
//		you.func02();
		
		Ex02 me2=new Ex02();
		System.out.println(me2.su1);
		me2.func02();
//		me2.func03();
	}

}
