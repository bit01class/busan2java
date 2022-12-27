package com.bit;

interface Inter{
	void func();
}

abstract class Lec05{
	void func02() {
		System.out.println("추상클래스의 기능");
	}
	public abstract void func();
}
class Lec55{
	public void func() {
		System.out.println("본래 기능");
	};
}

class Outter05{
	static void func01() {
		Lec55 obj=new Lec55(){
			public void func() {
				System.out.println("익명클래스만들기");
			}
		};
		obj.func();
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Outter05.func01();
	}

}
