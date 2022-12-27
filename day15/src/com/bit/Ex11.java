package com.bit;

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		Calendar cal;
		cal=new GregorianCalendar(2022,12-1,6,18,0,0);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(1+cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
	}

}
