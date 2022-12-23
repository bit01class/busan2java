package com.bit;

class Lec06{
	private Lec06() {}
	
	public static <T> T newInstance(T t) {
		T me=t;
		return me;
	}
}

class Lec66{
	
	public static <T> Box<T> newInstance(T t) {
		Box<T> box=new Box<T>();
		box.setSu(t);
		return box;
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Box<String>box=Lec66.<String>newInstance("abcd");
		String msg=box.getSu();
		System.out.println(msg);
		int[] a={1,2,3};
		int[] b;
		b= new int[]{1,2,3};
	}

}



