package com.bit;

import java.util.Calendar;

public class Ex09 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
	}

}
