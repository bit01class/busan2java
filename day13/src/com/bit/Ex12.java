package com.bit;

import java.util.*;
//class Lec12{}
class Lec12 implements Comparable{
	int val;
	
	public Lec12(int su) {
		val=su;
	}
	@Override
	public int compareTo(Object o) {
		return ((Lec12)o).val-val;
	}
	@Override
	public String toString() {
		return ""+val;
	}
	
}

public class Ex12 {

	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add(new Lec12(1111));
		set.add(new Lec12(4444));
		set.add(new Lec12(3333));
		set.add(new Lec12(2222));
		set.add(new Lec12(3333));
		
		Iterator ite=set.iterator();
		while(ite.hasNext()) {
			Object obj=ite.next();
			System.out.println(obj.toString());
		}
	}

}
