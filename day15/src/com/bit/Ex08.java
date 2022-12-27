package com.bit;

import java.util.Calendar;

public class Ex08 {

	public static void main(String[] args) {
		// 날짜
		long time=System.currentTimeMillis();
		java.util.Calendar cal;
		// 1~12
		// 0~11
		cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(1+cal.get(Calendar.MONTH)+"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"일");
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			System.out.println("일요일");break;
		case Calendar.MONDAY:
			System.out.println("월요일");break;
		case 3:
			System.out.println("화요일");break;
		case 4:
			System.out.println("수요일");break;
		case 5:
			System.out.println("목요일");break;
		case 6:
			System.out.println("금요일");break;
		case 7:
			System.out.println("토요일");break;
		}
		switch(cal.get(Calendar.AM_PM)) {
		case Calendar.AM:
			System.out.println("AM");break;
		case Calendar.PM:
			System.out.println("PM");break;
		}
		System.out.println(cal.get(Calendar.AM)*12
								+cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
	}

}






