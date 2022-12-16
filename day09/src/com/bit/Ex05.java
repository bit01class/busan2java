package com.bit;

class Lec05{
	int su1=1111;
	void func01() {
		System.out.println("부모기능"+su1);
	}
}

public class Ex05 extends Lec05{
	int su1=2222;
	void func01() {
		this.func01();
		System.out.println("자식기능"+super.su1);
	}
	void func02() {
		System.out.println("다른기능2");
	}

	public static void main(String[] args) {
		Lec05 me1=new Lec05();
		me1.func01();
		Ex05 me2=new Ex05();
		me2.func01();
		me2.func02();
		Lec05 me3=new Ex05();
		me3.func01();
		((Ex05)me3).func02();
		
	}

}
