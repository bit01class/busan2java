package com.bit;

public class Ex08 {
	
	public static void func(Object su) {}

	public static void main(String[] args) {
		// 래퍼 클래스
		int su1=1111;
		Integer su2=new Integer(2222);
		Integer su3=3333;
		Integer su4=new Integer("3333");
		System.out.println(su3.intValue()==su4.intValue());
		System.out.println(su3.equals(su4));
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.parseInt("1234")+1);
		int su=2;
		System.out.println(Integer.reverse(su));
		int su9=16;
		System.out.println(Integer.toBinaryString(su9));
		System.out.println(Integer.toOctalString(su9));
		System.out.println(Integer.toHexString(su9));
		
		byte su11=1;
		Byte su10=new Byte(su11);
		
		System.out.println(Integer.compare(su2,su3));
		System.out.println(su2.compareTo(su3));
	}

}






