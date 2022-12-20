package com.bit;

interface Lec08{
	public final static int su1=1111;
	final static int su2=2222;
	static int su3=3333;
	int su4=4444;
	
	public abstract void func01();
	public void func03();
	void func04();
//	public void func03() {}
}
interface Lec888{}
interface Lec88 extends Lec08,Lec888{
	public abstract void func03();
}

public class Ex08 extends Object 
				implements Lec88{
	public void func01() {}
	public void func02() {}

	public static void main(String[] args) {
		Lec08 me=new Ex08();
		System.out.println(Lec08.su4);
//		Lec08.su3++;
		

	}
	public void func03() {}
	public void func04() {}
}
