package com.bit;

interface Inter2
{
void func();	
}

public class Ex06 {
	static Inter2 obj=new Inter2() {
		public void func() {
			System.out.println("기능구현");
		}
	};

	public static void main(String[] args) {
		Ex06.obj.func();
	}

}
