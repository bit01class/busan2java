package com.bit;

public class Ex09 {

	public static void main(String[] args) {
		double su1=3.14;
		Double su2=new Double(3.14);
		Double su3=new Double("3.14");
		System.out.println(su2.intValue());
		System.out.println(Double.parseDouble("3.14"));
		System.out.println(Double.toHexString(3.14));
		double su4=0.0;
		double su5=0.0;
		System.out.println(su4/su5);
		System.out.println(Double.isInfinite(su4/su5));
		System.out.println(Double.isNaN(su4/su5));
//		float su6=3.14;
		Float su7=new Float(3.14);
	}

}
