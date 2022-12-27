package com.bit;

import java.util.Calendar;

public class Ex10 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int before=cal.get(Calendar.DAY_OF_YEAR);
		cal.set(2021, 12-1, 6,0,0,0);
		System.out.println(
				cal.get(Calendar.YEAR)+"년"
				+(1+cal.get(Calendar.MONTH))+"월"
				+cal.get(Calendar.DATE)+"일"
				+cal.get(Calendar.HOUR)+"시"
				);
		int after=cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(before-after+1);
		Calendar cal2=Calendar.getInstance();
		System.out.println(cal2.before(cal));
		System.out.println(cal2.after(cal));
		System.out.println(cal.compareTo(cal2));
	}

}
