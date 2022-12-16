package com.bit;

class Lec06{
	
	public Lec06() {
		super();
	}
	
	void func01() {
		System.out.println("부모기능");
	}
}

public class Ex06 extends Lec06 {

	public Ex06(){
		super();
	}
	
	public Ex06(int a) {
		this();
	}
	public Ex06(double a) {
		this();
	}

	public static void main(String[] args) {
		Ex06 me=new Ex06();
		me.func01();
	}

}
