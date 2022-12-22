package com.bit;
// 상속 금지
final class Lec03{
	final static int su2=2222;
	final int su3=3333;
	
	public static void func01(final int su) {
		
	}
	// 오버라이드 금지
	public final void func02() {}
}

public class Ex03{

	public static void main(String[] args) {
		final int su1=1111;
		Lec03.func01(1);
		Lec03.func01(2);
	}

}
